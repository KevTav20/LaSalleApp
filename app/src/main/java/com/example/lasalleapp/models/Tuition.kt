package com.example.lasalleapp.models

import java.time.Month

data class Tuition(
    val id: Int,
    val name : String,
    val maturity : String,
    val period: String,
    val import : Int,
    val state : Boolean,
    val folio : String
)
