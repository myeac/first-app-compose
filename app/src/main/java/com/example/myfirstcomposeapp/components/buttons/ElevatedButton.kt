package com.example.myfirstcomposeapp.components.buttons

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun MyElevatedButton() {
    ElevatedButton(
        onClick = {},
        elevation = ButtonDefaults
            .elevatedButtonElevation(
                pressedElevation = 16.dp
            )

    ) {
        Text("elevated button test")
    }
    ElevatedButton(
        onClick = {},
        elevation = ButtonDefaults
            .filledTonalButtonElevation(
                pressedElevation = 16.dp
            )
    ) {
        Text("filled tonal button test")
    }
    FilledTonalButton(
        onClick = {}
    ) {
        Text("filled tonal button structured test")
    }
}