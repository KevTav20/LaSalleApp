package com.example.lasalleapp.models

data class Student(
    val id: Int,
    val fullName: String,
    val dateOfBirth: String,
    val institutionalEmail: String,
    val career: String,
    val imageUrl: String,
    val password: String,
    val currentSemester: String,
    val subjects: List<Subject>,
    val pastSemesters: List<Float> // Adding past semester averages
) {
    // Current semester average
    val semesterAverage: Float
        get() = if (subjects.isNotEmpty()) {
            subjects.map { it.semesterAverage }.average().toFloat()
        } else 0f

    // Accumulated average across all semesters
    val accumulatedAverage: Float
        get() {
            val allSemesters = pastSemesters + semesterAverage // Include past averages and current
            return if (allSemesters.isNotEmpty()) {
                allSemesters.average().toFloat()
            } else 0f
        }
}

