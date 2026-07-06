package com.example.myfirstcomposeapp.components.scaffold

import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.myfirstcomposeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text("My app text test") },
        navigationIcon = {
            Icon(
                painter = painterResource((R.drawable.ic_menu_profile)),
                contentDescription = "bike back"
            )
        },
        actions = {
            Icon(
                painter = painterResource((R.drawable.ic_bike)),
                contentDescription = "bike back",
            )
            Icon(
                painter = painterResource((R.drawable.ic_weight)),
                contentDescription = "bike back",
                tint = Color.Yellow
            )
            Icon(
                painter = painterResource((R.drawable.ic_qr_code)),
                contentDescription = "bike back"
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Gray,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.Magenta,
            actionIconContentColor = Color.Red
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBarClickable(
    modifier: Modifier = Modifier,
    onNavSelected: () -> Unit
) {
    TopAppBar(
        title = { Text("My app text test") },
        navigationIcon = {
            Icon(
                painter = painterResource((R.drawable.ic_menu_profile)),
                contentDescription = "bike back",
                modifier = Modifier.clickable { onNavSelected() }
            )
        },
        actions = {
            Icon(
                painter = painterResource((R.drawable.ic_bike)),
                contentDescription = "bike back",
            )
            Icon(
                painter = painterResource((R.drawable.ic_weight)),
                contentDescription = "bike back",
                tint = Color.Yellow
            )
            Icon(
                painter = painterResource((R.drawable.ic_qr_code)),
                contentDescription = "bike back"
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Gray,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.Magenta,
            actionIconContentColor = Color.Red
        )
    )
}