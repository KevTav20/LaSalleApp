package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.models.Tuition
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.commponents.TutionItem


@Composable
fun PaymentsScreen(innerPadding: PaddingValues, navController: NavController, student: Student) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            items(student.tution) { tuition ->
                TutionItem(navController = navController, tuition)
            }
        }
    }
}


@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PaymentsScreenPreview() {
    val student = Student(
        id = 4,
        fullName = "Diana Prince",
        dateOfBirth = "2002-07-09",
        institutionalEmail = "diana.prince@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/uC8PARb.jpg",
        password = "diana1011",
        currentSemester = "4",
        subjects = listOf(
            Subject(
                id = 22,
                subjectName = "Human-Computer Interaction",
                partialGrades = listOf(9.0f, 8.5f, 9.0f)
            ), Subject(
                id = 23,
                subjectName = "Parallel Computing",
                partialGrades = listOf(9.5f, 9.0f, 9.0f)
            ), Subject(
                id = 24, subjectName = "Computer Graphics", partialGrades = listOf(8.5f, 9.0f, 9.5f)
            ), Subject(
                id = 25, subjectName = "Game Development", partialGrades = listOf(9.0f, 8.5f, 8.0f)
            ), Subject(
                id = 26,
                subjectName = "Blockchain Technology",
                partialGrades = listOf(8.5f, 8.0f, 9.5f)
            ), Subject(
                id = 27, subjectName = "Software Testing", partialGrades = listOf(9.0f, 9.5f, 8.5f)
            ), Subject(id = 28, subjectName = "DevOps", partialGrades = listOf(9.0f, 8.0f, 9.5f))
        ),
        pastSemesters = listOf(10f, 7.5f, 9.7f),
        tution = listOf(
            Tuition(
                16,
                "PRIMER PAGO",
                "enero 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020784"
            ),
            Tuition(
                17,
                "SEGUNDO PAGO",
                "febrero 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020785"
            ),
            Tuition(
                18,
                "TERCER PAGO",
                "marzo 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020786"
            ),
            Tuition(
                19,
                "CUARTO PAGO",
                "abril 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                false,
                "CPAL00020787"
            ),
            Tuition(
                20,
                "QUINTO PAGO",
                "mayo 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                false,
                "CPAL00020788"
            ),
        )
    )
    val navController = rememberNavController()
    LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues(), navController = navController, student)
    }
}