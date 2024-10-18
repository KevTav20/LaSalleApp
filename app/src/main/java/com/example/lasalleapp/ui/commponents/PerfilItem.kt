package com.example.lasalleapp.ui.commponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.example.lasalleapp.models.Tuition
import com.example.lasalleapp.ui.screens.HomeScreen
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.utils.Cake2

@Composable
fun PerfilItem(student: Student) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .padding(vertical = 10.dp),
                    text = student.fullName,
                    style = MaterialTheme.typography.titleLarge
                )
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .placeholder(R.drawable.student_1)
                        .data(student.imageUrl)
                        .build(),
                    contentDescription = "ProfileImage",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                androidx.compose.material3.Icon(
                    imageVector = Cake2,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Text(
                    text = student.dateOfBirth,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Text(
                    text = student.institutionalEmail,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(
)
@Composable
fun PerfilItemPreview() {
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
    LaSalleAppTheme {
        PerfilItem(student = student)
    }
}