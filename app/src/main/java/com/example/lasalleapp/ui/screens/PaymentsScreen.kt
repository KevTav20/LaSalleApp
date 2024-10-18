package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.utils.Screens
import com.example.lasalleapp.ui.utils.newsList

@Composable
fun PaymentsScreen(innerPadding: PaddingValues){
    Text(text = "Esto es Payments")

}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PaymentsScreen(){
    LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues())
    }
}