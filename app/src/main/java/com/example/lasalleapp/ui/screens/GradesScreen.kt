package com.example.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.ui.commponents.ScreenTemplate
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.models.Tuition
import com.example.lasalleapp.ui.commponents.SubjectItem
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun GradesScreen(navController: NavController, innerPadding: PaddingValues, student: Student) {
    ScreenTemplate(
        innerPadding = innerPadding,
        header = {
            Text(text = "Grades for ${student.fullName}")
        },
        body = {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Student: ${student.fullName}", style = MaterialTheme.typography.titleLarge)
                Text(text = "Current Semester: ${student.currentSemester}", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(16.dp))

                student.subjects.forEach { subject ->
                    SubjectItem(subject = subject) {
                        navController.navigate("subject/${subject.id}")
                    }
                }

            }
        }
    )
}

@Preview
@Composable
fun PreviewGradesScreen() {
    LaSalleAppTheme {
        // Crea un NavController ficticio para la preview
        val navController = rememberNavController()

        // Simula un objeto Student para la preview
        val student = Student(
            id = 1,
            fullName = "Alice Johnson",
            dateOfBirth = "2001-01-10",
            institutionalEmail = "alice.johnson@university.edu",
            career = "ISSC",
            imageUrl = "https://imgur.com/8jnXixi.jpg",
            password = "alice123",
            currentSemester = "1",
            subjects = listOf(
                Subject(id = 1, subjectName = "Math", partialGrades = listOf(8.0f, 9.0f, 7.5f)),
                Subject(id = 2, subjectName = "Physics", partialGrades = listOf(7.0f, 8.5f, 9.0f)),
                Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf(9.5f, 8.5f, 10f)),
                Subject(id = 4, subjectName = "Biology", partialGrades = listOf(7.5f, 8.0f, 7.0f)),
                Subject(id = 5, subjectName = "History", partialGrades = listOf(8.0f, 9.5f, 9.0f)),
                Subject(
                    id = 6, subjectName = "Data Structures", partialGrades = listOf(7.5f, 8.0f, 8.5f)
                ),
                Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf(9.0f, 9.5f, 8.5f))
            ),
            pastSemesters = listOf(0f),
            tution = listOf(
                // Primer grupo de 5 estudiantes (Periodo AGO-DIC 2024)
                Tuition(
                    1,
                    "PRIMER PAGO DE COLEGIATURA",
                    "agosto 16 de 2024",
                    "57 - AGO-DIC 2024",
                    15000,
                    true,
                    "CPAL00020769"
                ),
                Tuition(
                    2,
                    "SEGUNDO PAGO DE COLEGIATURA",
                    "septiembre 16 de 2024",
                    "57 - AGO-DIC 2024",
                    15000,
                    true,
                    "CPAL00020770"
                ),
                Tuition(
                    3,
                    "TERCER PAGO DE COLEGIATURA",
                    "octubre 16 de 2024",
                    "57 - AGO-DIC 2024",
                    15000,
                    true,
                    "CPAL00020771"
                ),
                Tuition(
                    4,
                    "CUARTO PAGO DE COLEGIATURA",
                    "noviembre 16 de 2024",
                    "57 - AGO-DIC 2024",
                    15000,
                    true,
                    "CPAL00020772"
                ),
                Tuition(
                    5,
                    "QUINTO PAGO DE COLEGIATURA",
                    "diciembre 16 de 2024",
                    "57 - AGO-DIC 2024",
                    15000,
                    true,
                    "CPAL00020773"
                ),
            )
        )

        // Llama a la función GradesScreen para la preview
        GradesScreen(navController = navController, innerPadding = PaddingValues(0.dp), student = student)
    }
}

