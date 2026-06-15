package com.example.myfirstcomposeapp.components.layouts.task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview()
@Composable
fun TaskBoxesPreview() {
    TaskBoxes(Modifier)
}

@Composable
fun TaskBoxes(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        Row(
            modifier = Modifier
                .background(Color.Transparent)
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Ejemplo 2",
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}