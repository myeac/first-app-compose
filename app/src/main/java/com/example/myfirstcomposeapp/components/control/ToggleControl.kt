package com.example.myfirstcomposeapp.components.control

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.myfirstcomposeapp.R

@Composable
fun MySwitch(
    modifier: Modifier = Modifier
) {

    var switchState by remember { mutableStateOf(true) }

    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it }
        )
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            colors = SwitchDefaults.colors(
                //bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                //icons
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                //border
                checkedBorderColor = Color.Magenta,
                uncheckedBorderColor = Color.Black,
                //track
                checkedTrackColor = Color.White,
                uncheckedTrackColor = Color.LightGray
            )
        )
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            enabled = false,
            colors = SwitchDefaults.colors(
                //bolita
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Cyan,
                //icons
                disabledCheckedIconColor = Color.Green,
                disabledUncheckedIconColor = Color.Red,
                //border
                disabledCheckedBorderColor = Color.Gray,
                disabledUncheckedBorderColor = Color.DarkGray,
                //track
                disabledCheckedTrackColor = Color.Magenta,
                disabledUncheckedTrackColor = Color.LightGray
            )
        )
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            thumbContent = { Text("switch text") }
        )
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            thumbContent = { Text("switch text") },
            enabled = false
        )
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            thumbContent = {
                Icon(
                    painter = painterResource(R.drawable.ic_menu_profile),
                    contentDescription = "icono switch"
                )
            }
        )
    }
}