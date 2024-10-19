package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun PasswordScreen(innerPadding: PaddingValues) {
//fun PasswordScreen(innerPadding: PaddingValues, navController: NavController, student: Student, onPasswordChange: (Student) -> Unit) {
    var newPassword by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }
    var showSuccess by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Cambiar Contraseña", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = newPassword,
            onValueChange = { newPassword = it },
            label = { Text("Nueva Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirmar Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(16.dp))
        if (showError) {
            Text(text = "Las contraseñas no coinciden", color = Color.Red)
        }
        if (showSuccess) {
            Text(text = "Contraseña cambiada exitosamente", color = Color.Green)
        }

        Button(
            onClick = {
//                if (newPassword == confirmPassword && newPassword.isNotBlank()) {
//                    val updatedStudent = student.copy(password = newPassword)
//                    onPasswordChange(updatedStudent)
//                    showError = false
//                    showSuccess = true
//                    navController.popBackStack()
//                } else {
//                    showError = true
//                    showSuccess = false
//                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Guardar Contraseña")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPasswordScreen() {
    val navController = rememberNavController()

    // Crear un estudiante de ejemplo
    val student = Student(
        id = 1,
        fullName = "Alice Johnson",
        dateOfBirth = "2001-01-10",
        institutionalEmail = "alice.johnson@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/8jnXixi.jpg",
        password = "alice123",
        currentSemester = "1",
        subjects = emptyList(), // Puedes dejar esto vacío o agregar ejemplos
        pastSemesters = listOf(0f),
        tution = emptyList() // También puedes dejar esto vacío si no es relevante
    )

    LaSalleAppTheme {
        PasswordScreen(
            innerPadding = PaddingValues(),
//            navController = navController,
//            student = student,
//            onPasswordChange = { updatedStudent ->
//                // Aquí podrías manejar el estudiante actualizado si es necesario
//            }
        )
    }
}


