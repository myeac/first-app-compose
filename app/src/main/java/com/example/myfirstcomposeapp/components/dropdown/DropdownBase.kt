package com.example.myfirstcomposeapp.components.dropdown

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.example.myfirstcomposeapp.R

@Composable
fun MyDropDownItemBase(
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        MyDropdownItemMuscle()
        MyDropdownItemBike()
        MyDropDownItemQr()
    }
}

@Composable
fun MyDropdownItemMuscle(
) {
    DropdownMenuItem(
        modifier = Modifier.fillMaxWidth(),
        text = { Text("ejemplo 1") },
        onClick = { },
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_weight),
                contentDescription = "bike"
            )
        },
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_swimming),
                contentDescription = "bike"
            )
        },
        colors = MenuDefaults.itemColors(
            disabledTextColor = Color.Cyan,
            disabledLeadingIconColor = Color.DarkGray,
            disabledTrailingIconColor = Color.LightGray
        ),
        enabled = false
    )
}

@Composable
fun MyDropdownItemBike(
) {
    DropdownMenuItem(
        modifier = Modifier.fillMaxWidth(),
        text = { Text("ejemplo 1") },
        onClick = { },
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_bike),
                contentDescription = "bike"
            )
        },
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_swimming),
                contentDescription = "bike"
            )
        },
        contentPadding = PaddingValues(horizontal = 30.dp),
        enabled = true
    )
}

@Composable
fun MyDropDownItemQr(
) {
    DropdownMenuItem(
        modifier = Modifier.fillMaxWidth(),
        text = { Text("ejemplo 1") },
        onClick = { },
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_qr_code),
                contentDescription = "bike"
            )
        },
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_swimming),
                contentDescription = "bike"
            )
        },
        enabled = true,
        colors = MenuDefaults.itemColors(
            textColor = Color.Blue,
            leadingIconColor = Color.Magenta,
            trailingIconColor = Color.Green
        )
    )
}

