package com.example.lasalleapp.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.utils.studentsList

@Composable
fun LoginScreen(navController: NavController, context: Context) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    val sharedPreferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
    val isLogged = sharedPreferences.getBoolean("isLogged", false)


    if (isLogged) {
        LaunchedEffect(Unit) {
            navController.navigate("home") {
                popUpTo("login") { inclusive = true }
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(0.8f),
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            )
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(0.8f),
            visualTransformation = PasswordVisualTransformation(),
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            )
        )

        Button(
            onClick = {
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(context, "Email or password is empty", Toast.LENGTH_SHORT).show()
                    return@Button
                }

                val validStudent = studentsList.find { student ->
                    student.institutionalEmail == email && student.password == password
                }

                if (validStudent != null) {
                    // Guardar el ID del estudiante o correo en SharedPreferences
                    with(sharedPreferences.edit()) {
                        putBoolean("isLogged", true)
                        putString("studentEmail", validStudent.institutionalEmail) // O bien usar validStudent.id
                        apply()
                    }

                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                } else {
                    Toast.makeText(context, "Incorrect email or password", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text("Login")
        }

    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginScreenPreview() {
    val navController = rememberNavController()
    val context = androidx.compose.ui.platform.LocalContext.current

    LaSalleAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp), navController, context)
    }
}


