package com.example.lasalleapp.ui.commponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.Subject

@Composable
fun SubjectItem(subject: Subject, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = subject.subjectName, style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "Average: ${subject.semesterAverage()}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(onClick = onClick) {
            Text(text = "View Details")
        }
    }
}

// Function to calculate the semester average for each subject
fun Subject.semesterAverage(): Float {
    return if (partialGrades.isNotEmpty()) {
        partialGrades.sum() / partialGrades.size
    } else 0f
}

// Sample data for preview
@Preview
@Composable
fun SubjectItemPreview() {
    val sampleSubject = Subject(
        id = 1,
        subjectName = "Mathematics",
        partialGrades = listOf(9.0f, 8.5f, 9.2f)
    )
    SubjectItem(subject = sampleSubject, onClick = {

    })
}
