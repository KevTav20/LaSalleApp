package com.example.lasalleapp.ui.commponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.models.Tuition
import com.example.lasalleapp.ui.theme.LaSalleAppTheme


@Composable
fun TutionItem(navController: NavController, tuition: Tuition) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Gray)
            .padding(vertical = 20.dp)
            .padding(horizontal = 0.dp)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Periodo",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = tuition.period,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "No. ${tuition.id}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .weight(0.5f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = tuition.name,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 5.dp),
                        color = Color.White
                    )
                    Text(
                        text = "Folio: ${tuition.folio}",
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        color = Color.White
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(0.5f),
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(
                        text = "Vencimiento",
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        color = Color.White
                    )
                    Text(
                        text = tuition.maturity,
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        color = Color.White
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = if (tuition.state) "Estado: Pagado" else "Estado: Pendiente",
                    style = MaterialTheme.typography.labelMedium,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(50.dp))
                Text(
                    text = "Total a pagar $ ${tuition.import}",
                    style = MaterialTheme.typography.labelMedium,
                    color = Color.White
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Button(
                    onClick = { navController.navigate("reception") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(32.dp)
                ) {
                    Text(
                        modifier = Modifier,
                        text = "Ver Recibo",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.width(30.dp))
                Button(
                    onClick = { navController.navigate("ban_bajio") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(32.dp)
                ) {
                    Text(
                        text = "Pagar en Línea",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White
                    )
                }
            }
        }
    }
}



@Preview
@Composable
fun TuitionItemPreview() {
    val tuition = Tuition(
        id = 21,
        name = "PRIMER PAGO",
        maturity = "agosto 16 de 2026",
        period = "61 - AGO-DIC 2026",
        import = 15000,
        state = false,
        folio = "CPAL00020789"
    )
    val navController = rememberNavController()
    LaSalleAppTheme {
        TutionItem(navController = navController, tuition = tuition )
    }
}

