package com.example.myfirstcomposeapp.components.loading

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun MyCircularProgressIndicator(){

    Row() {
        CircularProgressIndicator(
            modifier = Modifier.size(80.dp),
            color = Color.Red,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Square
        )
        Spacer(Modifier.width(10.dp))
        CircularProgressIndicator(
            modifier = Modifier.size(80.dp),
            color = Color.Green,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Butt
        )
        Spacer(Modifier.width(10.dp))
        CircularProgressIndicator(
            modifier = Modifier.size(80.dp),
            color = Color.Yellow,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round
        )
    }
}