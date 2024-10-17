package com.example.lasalleapp.ui.utils

sealed class Screens(val route : String) {
    data object  Home : Screens("home")
    data object  Grades : Screens("grades")
    data object  Calendar : Screens("calendar")
    data object  Settings : Screens("settings")
    data object  NewsDetail : Screens("news-detail")
    data object  Login : Screens("login")
    data object Subject : Screens("subject")
    data object  Payments : Screens("payments")
}