package com.example.lasalleapp.models

data class Subject(
    val id: Int,
    val subjectName: String,
    val partialGrades: List<Float>
) {
    // Cálculo de promedio del semestre
    val semesterAverage: Float
        get() = if (partialGrades.isNotEmpty()) {
            partialGrades.average().toFloat()
        } else 0f
}

