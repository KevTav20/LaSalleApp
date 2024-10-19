package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun SubjectScreen(subject: Subject, innerPadding: PaddingValues) {
    // Calcular el promedio
    val average = if (subject.partialGrades.isNotEmpty()) {
        subject.partialGrades.average().toFloat()
    } else {
        0f
    }

    Column(modifier = Modifier
        .padding(innerPadding)
        .padding(16.dp)) {
        // Título del nombre de la materia
        Text(text = subject.subjectName, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        // Tabla con bordes
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
                .padding(8.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.Black)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Parcial", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Calificación", style = MaterialTheme.typography.bodyMedium)
            }

            subject.partialGrades.forEachIndexed { index, grade ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Black)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Parcial ${index + 1}", style = MaterialTheme.typography.bodySmall)
                    Text(text = "$grade", style = MaterialTheme.typography.bodySmall)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.Black)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Promedio Final", style = MaterialTheme.typography.titleMedium)
                Text(text = "%.1f".format(average), style = MaterialTheme.typography.titleMedium) // Redondea a 1 decimal
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SubjectScreenPreview() {
    val exampleSubject = Subject(
        id = 1,
        subjectName = "Desarrollo de Aplicaciones Móviles",
        partialGrades = listOf(8.5f, 9.0f, 9.2f)
    )

    LaSalleAppTheme {
        SubjectScreen(subject = exampleSubject, innerPadding = PaddingValues())
    }
}
