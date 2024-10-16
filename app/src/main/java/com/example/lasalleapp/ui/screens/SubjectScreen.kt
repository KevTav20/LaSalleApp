// SubjectScreen.kt

package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.navDeepLink
import com.example.lasalleapp.models.Subject

@Composable
fun SubjectScreen(subject: Subject) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = subject.subjectName, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        // Display the partial grades
        subject.partialGrades.forEachIndexed { index, grade ->
            Text(text = "Partial ${index + 1}: $grade", style = MaterialTheme.typography.bodyMedium)
        }

        // Display the average grade
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Average: ${subject.semesterAverage}", style = MaterialTheme.typography.titleLarge)
    }
}
