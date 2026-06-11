package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun MyRow(
    modifier: Modifier
) {
    //Linearlayout en posicion horizontal
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
                .weight(1f)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
                .weight(1f)
        )
    }
}


@Composable
fun MyRowScroll(
    modifier: Modifier
) {
    //Linearlayout en posicion horizontal
    Row(
        modifier = modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola 2",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola 3",
            modifier = Modifier
                .background(Color.Cyan)
        )
    }
}