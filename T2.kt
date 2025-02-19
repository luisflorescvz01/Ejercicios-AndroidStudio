package com.example.hola_mundo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TablaContabilidad() {
    var colorblue by remember { mutableStateOf(Color.Black) }
    var colorred by remember { mutableStateOf(Color.Red) }
    var bold by remember { mutableStateOf(FontWeight.Normal) }
    var bandera by remember { mutableStateOf(R.drawable.alemania) }

    val datos = listOf(
        Triple("Enero", 2000, 500),
        Triple("Febrero", 2000, 500),
        Triple("Marzo", 2000, 500),
        Triple("Abril", 4000, 4500),
        Triple("Mayo", 4000, 1200),
        Triple("Junio", 4000, 3000),
        Triple("Julio", 8000, 4500),
        Triple("Agosto", 8000, 4500),
        Triple("Septiembre", 8000, 4650),
        Triple("Octubre", 12000, 6000),
        Triple("Noviembre", 12000, 6000),
        Triple("Diciembre", 25000, 75000)
    )

    var resultados by remember { mutableStateOf(List(datos.size) { 0 }) }

    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {

        Column(horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = bandera),
                contentDescription = "Bandera",
                modifier = Modifier.size(100.dp)
            )
        }


        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contabilidad de Alfonso Estudiante", fontSize = 21.sp, fontWeight = FontWeight.Bold)
        }


        Row(modifier = Modifier.fillMaxWidth().padding(start = 135.dp)) {
            Text("Ingresos", color = Color.White, modifier = Modifier.background(Color.Green).width(90.dp).padding(5.dp))
            Text("Egresos", color = Color.White, modifier = Modifier.background(Color.Green).width(80.dp).padding(5.dp))
            Text("Neto", color = Color.White, modifier = Modifier.background(Color.Green).width(70.dp).padding(5.dp))
        }


        datos.forEachIndexed { index, (mes, ingresos, egresos) ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = mes,
                    color = Color.White,
                    modifier = Modifier.background(Color.Green).width(135.dp).padding(5.dp)
                )
                Text(
                    text = "$ingresos",
                    fontWeight = when (mes) {
                        "Enero", "Abril", "Julio" -> FontWeight.Bold
                        else -> FontWeight.Normal
                    },
                    color = if (mes == "Diciembre") Color.Blue else Color.Black,
                    modifier = Modifier.width(90.dp)
                )
                Text(text = "$egresos", modifier = Modifier.width(80.dp))
                Text(
                    text = "${resultados[index]}",
                    color = if (resultados[index] < 0) Color.Red else Color.Black,
                    modifier = Modifier.width(70.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Servicio ofrecido por", fontSize = 20.sp)
            Text(text = "RayMundo-ISND", fontSize = 18.sp)
        }


        Button(onClick = {
            bandera = R.drawable.mexico
            colorblue = Color.Blue
            bold = FontWeight.Bold


            resultados = datos.map { (mes, ingresos, egresos) -> ingresos - egresos }
        }, modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Text(text = "Resultados")
        }
    }
}