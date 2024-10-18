package com.example.lasalleapp

import android.os.Bundle
import androidx.compose.ui.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lasalleapp.ui.screens.CalendarScreen
import com.example.lasalleapp.ui.screens.GradesScreen
import com.example.lasalleapp.ui.screens.HomeScreen
import com.example.lasalleapp.ui.screens.NewsDetailScreen
import com.example.lasalleapp.ui.screens.SettingsScreen
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.utils.Screens
import com.example.lasalleapp.ui.utils.bottomNavBarItems
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.screens.LoginScreen
import com.example.lasalleapp.ui.screens.SubjectScreen
import com.example.lasalleapp.ui.utils.studentsList
import androidx.compose.runtime.LaunchedEffect
import com.example.lasalleapp.ui.screens.PaymentsScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()
            var selectedItemIndex by rememberSaveable { mutableStateOf(0) }
            val bottomNavRoutes = listOf(
                Screens.Home.route,
                Screens.Grades.route,
                Screens.Settings.route,
                Screens.Calendar.route
            )

            val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
            val isLogged = sharedPreferences.getBoolean("isLogged", false)

            LaSalleAppTheme {
                val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

                // Mueve la lógica de navegación aquí
                LaunchedEffect(isLogged) {
                    if (isLogged) {
                        navController.navigate("home") {
                            popUpTo("login") { inclusive = true } // Esto asegura que no puedas volver al login
                        }
                    }
                }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        if (currentRoute in bottomNavRoutes) {
                            AnimatedNavigationBar(
                                selectedIndex = selectedItemIndex,
                                modifier = Modifier.height(90.dp),
                                barColor = MaterialTheme.colorScheme.primary,
                                ballColor = MaterialTheme.colorScheme.primary,
                                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp)
                            ) {
                                bottomNavBarItems.forEachIndexed { index, bottomNavigationItem ->
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable {
                                                selectedItemIndex = index
                                                navController.navigate(bottomNavigationItem.route)
                                            }
                                    ) {
                                        Icon(
                                            imageVector = bottomNavigationItem.icon,
                                            contentDescription = bottomNavigationItem.title,
                                            tint = if (selectedItemIndex == index) Color.White else Color.White.copy(alpha = 0.5f),
                                            modifier = Modifier.size(26.dp)
                                        )
                                        Text(
                                            text = bottomNavigationItem.title,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = if (selectedItemIndex == index) Color.White else Color.White.copy(alpha = 0.5f)
                                        )
                                    }
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = if (isLogged) "home" else "login"
                    ) {
                        composable("login") {
                            LoginScreen(navController, context = this@MainActivity)
                        }
                        composable(route = Screens.Home.route) {
                            HomeScreen(innerPadding = innerPadding, navController = navController, context = this@MainActivity)
                        }
                        composable(route = Screens.Calendar.route) {
                            CalendarScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Grades.route) {
                            val studentEmail = sharedPreferences.getString("studentEmail", "")
                            val student = studentsList.find { it.institutionalEmail == studentEmail }
                            if (student != null) {
                                GradesScreen(navController, innerPadding = innerPadding, student = student)
                            }
                        }
                        composable(route = Screens.Settings.route) {
                            val studentEmail = sharedPreferences.getString("studentEmail", "")
                            val student = studentsList.find { it.institutionalEmail == studentEmail }
                            if (student != null) {
                                SettingsScreen(innerPadding = innerPadding, student = student)
                            }

                        }
                        composable(route = Screens.Payments.route) {
                            PaymentsScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.NewsDetail.route + "/{id}", arguments = listOf(navArgument("id") { type = NavType.IntType })) {
                            val id = it.arguments?.getInt("id", 0) ?: 0
                            NewsDetailScreen(newsId = id, innerPadding = innerPadding)
                        }
                        composable(
                            route = Screens.Subject.route + "/{subjectId}",
                            arguments = listOf(navArgument("subjectId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val subjectId = backStackEntry.arguments?.getInt("subjectId") ?: 0
                            val studentEmail = sharedPreferences.getString("studentEmail", "")
                            val student = studentsList.find { it.institutionalEmail == studentEmail }

                            val subject = student?.subjects?.find { it.id == subjectId }

                            if (subject != null) {
                                SubjectScreen(subject = subject)
                            }
                        }
                    }
                }
            }
        }

    }
}