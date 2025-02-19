package com.example.hola_mundo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Ej3(){
    Column(modifier = Modifier
        .padding(0.dp)
        .fillMaxSize()
        .background(Color.Black)
            , verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.White)
            , horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Row(modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.White)
            )
            {
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(120.dp)
                    .background(Color.Red))
                {
                    Text(text = "Top Start")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(120.dp)
                    .fillMaxHeight()
                    .background(Color.Blue),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Text(text = "Top")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(120.dp)
                    .height(50.dp)
                    .background(Color.Magenta),
                    horizontalAlignment = Alignment.End)
                {
                    Text(text = "Top End")
                }
            }
            Row(modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.White)
            )
            {
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(150.dp)
                    .height(100.dp)
                    .background(Color.Green))
                {
                    Text(text = "Center Start")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(60.dp)
                    .fillMaxHeight()
                    .background(Color.Gray),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Text(text = "Center")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .width(150.dp)
                    .height(50.dp)
                    .background(Color.Black),
                    horizontalAlignment = Alignment.End)
                {
                    Text(text = "Center End",
                        color = Color.White)
                }
            }
            Row(modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
                .height(210.dp)
                .background(Color.Yellow)
            )
            {
                Column(modifier = Modifier
                    .padding(0.dp)
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Cyan),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                )
                {
                    Text(text = "Bottom Start")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .fillMaxHeight()
                    .weight(2f)
                    .background(Color.DarkGray),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                )
                {
                    Text(text = "Bottom Center")
                }
                Column(modifier = Modifier
                    .padding(0.dp)
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Yellow),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                )
                {
                    Text(text = "Bottom End")
                }
            }
        }
    }
}