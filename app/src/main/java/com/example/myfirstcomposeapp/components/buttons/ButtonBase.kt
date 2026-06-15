package com.example.myfirstcomposeapp.components.buttons

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons(
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.e("JPC", "boton basico pulsado") },
            shape = RoundedCornerShape(percent = 32),
        ) {
            Text("press me")
        }
        Button(
            onClick = { Log.e("JPC", "boton deshabilitado") },
            enabled = false,
            colors = ButtonDefaults
                .buttonColors(
                    contentColor = Color.Yellow,
                    containerColor = Color.Green,
                    disabledContentColor = Color.Magenta,
                    disabledContainerColor = Color.LightGray
                )
        ) {
            Text("press me")
        }
        Button(
            onClick = { Log.e("JPC", "boton con diseno") },
            shape = RoundedCornerShape(percent = 32),
            border = BorderStroke(2.dp, Color.Red),
            colors = ButtonDefaults
                .buttonColors(
                    contentColor = Color.Yellow,
                    containerColor = Color.Green,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.Blue
                )
        ) {
            Text("press me", color = Color.Magenta)
        }
        Spacer(Modifier.height(16.dp))
        MyOutLinedButtonView()
        Spacer(Modifier.height(16.dp))
        MyTextButonExample()
        Spacer(Modifier.height(16.dp))
        MyElevatedButton()
    }
}


