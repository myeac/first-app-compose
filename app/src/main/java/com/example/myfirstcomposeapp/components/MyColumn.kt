package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun MyColumnWithWeight(
    modifier: Modifier = Modifier
) {
    //Linearlayout en posicion vertical
    Column(modifier = modifier) {
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
                .weight(1f)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
                .weight(1f)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun MyColumn(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun MyColumnBig(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "hola texto 1",
            modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "hola texto 2",
            modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "hola texto 3",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "hola texto 4",
            modifier = Modifier
                .background(Color.Blue)
        )
    }
}