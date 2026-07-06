package com.example.myfirstcomposeapp.components.dropdown

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties

@Composable
fun MyDropDownMenuBase(
    modifier: Modifier = Modifier
) {

    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .padding(horizontal = 8.dp)
    ) {
        Button(onClick = { expanded = true }) { Text("Ver opciones") }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            offset = DpOffset(24.dp, 24.dp),
            properties = PopupProperties(
                focusable = true,               //dar focus al primer item dentro de la lista
                dismissOnClickOutside = false,  //flag para cerrar al dar click por fuera de la lista
                dismissOnBackPress = false,     //back del navigation bar <
                clippingEnabled = true          //no sale de la view
            )
        ) {
            DropdownMenuItem(text = { Text("option 1") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("option 2") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("option 3") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("option 4") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("option 5") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("option 6") }, onClick = { expanded = false })
        }
    }
}