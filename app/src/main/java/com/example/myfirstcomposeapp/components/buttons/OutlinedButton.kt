package com.example.myfirstcomposeapp.components.buttons

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyOutLinedButtonView(
) {
    OutlinedButton(
        onClick = {},
        colors = ButtonDefaults
            .outlinedButtonColors(
                containerColor = Color.Magenta
            )
    ) {
        Text("outline button text")
    }
}