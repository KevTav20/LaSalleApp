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

                // Display each subject using SubjectItem
                student.subjects.forEach { subject ->
                    SubjectItem(subject = subject) {
                        // Pass the subjectId when navigating
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
            imageUrl = "https://example.com/alice.jpg",
            password = "alice123",
            currentSemester = "2024-1",
            subjects = listOf(
                Subject(id = 1, subjectName = "Math", partialGrades = listOf(8.0f, 9.0f, 7.5f)),
                Subject(id = 2, subjectName = "Physics", partialGrades = listOf(7.0f, 8.5f, 9.0f)),
                Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf(9.5f, 8.5f, 10f)),
                Subject(id = 4, subjectName = "Biology", partialGrades = listOf(7.5f, 8.0f, 7.0f)),
                Subject(id = 5, subjectName = "History", partialGrades = listOf(8.0f, 9.5f, 9.0f)),
                Subject(id = 6, subjectName = "Data Structures", partialGrades = listOf(7.5f, 8.0f, 8.5f)),
                Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf(9.0f, 9.5f, 8.5f))
            ),
            pastSemesters = listOf(10f, 10f, 9.7f)
        )

        // Llama a la función GradesScreen para la preview
        GradesScreen(navController = navController, innerPadding = PaddingValues(0.dp), student = student)
    }
}

