package com.example.lasalleapp.ui.commponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.lasalleapp.R
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.screens.HomeScreen
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun PerfilItem(student: Student){
    Row {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .placeholder(R.drawable.student_1)
                .data(student.imageUrl)
                .build(),
            contentDescription = "CardImage",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column {

        }
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PerfilItemPreview() {
    val student = Student(
        id = 1,
        fullName = "Alice Johnson",
        dateOfBirth = "2001-01-10",
        institutionalEmail = "alice.johnson@university.edu",
        career = "ISSC",
        imageUrl = "https://example.com/alice.jpg",
        password = "alice123",
        currentSemester = "1",
        subjects = listOf(
            Subject(id = 1, subjectName = "Math", partialGrades = listOf(8.0f, 9.0f, 7.5f)),
            Subject(id = 2, subjectName = "Physics", partialGrades = listOf(7.0f, 8.5f, 9.0f)),
            Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf(9.5f, 8.5f, 10f)),
            Subject(id = 4, subjectName = "Biology", partialGrades = listOf(7.5f, 8.0f, 7.0f)),
            Subject(id = 5, subjectName = "History", partialGrades = listOf(8.0f, 9.5f, 9.0f)),
            Subject(
                id = 6,
                subjectName = "Data Structures",
                partialGrades = listOf(7.5f, 8.0f, 8.5f)
            ),
            Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf(9.0f, 9.5f, 8.5f))
        ),
        pastSemesters = listOf(0f)
    )
    LaSalleAppTheme {
        PerfilItem(student = student)
    }
}