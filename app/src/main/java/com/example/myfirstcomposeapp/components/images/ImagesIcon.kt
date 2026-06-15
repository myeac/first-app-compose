package com.example.myfirstcomposeapp.components.images

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.R

@Composable
fun MyImageIcon(){
    Icon(
        modifier = Modifier.size(108.dp),
        painter = painterResource(R.drawable.ic_menu_profile),
        contentDescription = null,
        tint = Color.Cyan
    )
}