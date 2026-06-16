package com.example.myfirstcomposeapp.components.loading

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyLinearProgressIndicator(
    modifier: Modifier = Modifier
) {

    Column(
        modifier.padding(16.dp)
    ) {
        LinearProgressIndicator(
            color = Color.Red,
            trackColor = Color.Green,
            strokeCap = StrokeCap.Butt
        )
        Spacer(Modifier.height(12.dp))
        LinearProgressIndicator(
            color = Color.Yellow,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round
        )
        Spacer(Modifier.height(12.dp))
        LinearProgressIndicator(
            color = Color.Magenta,
            trackColor = Color.Cyan,
            strokeCap = StrokeCap.Square
        )
    }
}