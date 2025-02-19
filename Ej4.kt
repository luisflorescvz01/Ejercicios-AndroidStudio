package com.example.hola_mundo

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Matematicas() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Calculadora", fontSize = 24.sp)

        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("Número 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("Número 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Text(text = "Resultado: $resultado", fontSize = 18.sp, color = Color.Blue)

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Button(onClick = { resultado = ((num1.toIntOrNull() ?: 0) + (num2.toIntOrNull() ?: 0)).toString() }) {
                Text("Sumar")
            }

            OutlinedButton(onClick = { resultado = ((num1.toIntOrNull() ?: 0) - (num2.toIntOrNull() ?: 0)).toString() }) {
                Text("Restar")
            }
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            IconButton(onClick = { resultado = ((num1.toIntOrNull() ?: 0) * (num2.toIntOrNull() ?: 0)).toString() }) {
                Icon(Icons.Default.Calculate, contentDescription = "Multiplicar")
            }

            Image(
                painter = painterResource(android.R.drawable.ic_menu_help),
                contentDescription = "Dividir",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {
                        val n1 = num1.toIntOrNull() ?: 0
                        val n2 = num2.toIntOrNull() ?: 1
                        resultado = if (n2 != 0) (n1 / n2).toString() else "Error"
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComparadorNumeros() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var num3 by remember { mutableStateOf("") }
    var mayor by remember { mutableStateOf("0") }
    var menor by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Comparador de Números", fontSize = 24.sp)

        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("Número 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("Número 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = num3,
            onValueChange = { num3 = it },
            label = { Text("Número 3") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(onClick = {
            val nums = listOf(num1.toIntOrNull() ?: 0, num2.toIntOrNull() ?: 0, num3.toIntOrNull() ?: 0)
            mayor = nums.maxOrNull().toString()
            menor = nums.minOrNull().toString()
        }) {
            Text("Calcular Mayor y Menor")
        }

        Text(text = "Mayor: $mayor", fontSize = 18.sp, color = Color.Black)
        Text(text = "Menor: $menor", fontSize = 18.sp, color = Color.Black)
    }
}