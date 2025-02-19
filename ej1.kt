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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Ej1(){
    Column(modifier = Modifier
        .padding(0.dp)
        .width(300.dp)
        .height(450.dp)
        .background(Color.LightGray)
        , verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Column(modifier = Modifier
            .padding(0.dp)
            .height(215.dp)
            .fillMaxWidth()
            .background(Color.White)
        )
        {
            Row(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Blue)
            )
            {

            }
            Row(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Green)
            )
            {

            }
            Row(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Blue)
            )
            {

            }
        }




        //Abajo
        Row(modifier = Modifier
            .padding(0.dp)
            .fillMaxSize()
            .background(Color.White)
        )

        {
            Column(modifier = Modifier
                .padding(5.dp)
                .width(90.dp)
                .fillMaxHeight()
                .background(Color.Blue))
            {

            }
            Column(modifier = Modifier
                .padding(5.dp)
                .width(90.dp)
                .fillMaxHeight()
                .background(Color.Cyan))
            {

            }
            Column(modifier = Modifier
                .padding(5.dp)
                .width(90.dp)
                .fillMaxHeight()
                .background(Color.Blue))
            {

            }
        }
    }

}