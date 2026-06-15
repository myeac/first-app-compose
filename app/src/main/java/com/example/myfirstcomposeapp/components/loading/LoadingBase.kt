package com.example.myfirstcomposeapp.components.loading

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressCircle(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(150.dp),
            color = Color.Red,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Square
        )
        Spacer(Modifier.height(10.dp))
        CircularProgressIndicator(
            modifier = Modifier.size(150.dp),
            color = Color.Green,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Butt
        )
        Spacer(Modifier.height(10.dp))
        CircularProgressIndicator(
            modifier = Modifier.size(150.dp),
            color = Color.Yellow,
            strokeWidth = 10.dp,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round
        )
    }
}