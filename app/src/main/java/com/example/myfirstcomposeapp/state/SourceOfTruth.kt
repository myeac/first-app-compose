package com.example.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MySourceOfTruth(
    modifier: Modifier
) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = modifier) {
        MyStateSourceExampleOne(number) { number += 1 }
        MyStateSourceExampleTwo(number = number, onClick = { number += 1 })
    }
}

@Composable
fun MyStateSourceExampleOne(
    number: Int,
    onClick: () -> Unit
) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}

@Composable
fun MyStateSourceExampleTwo(
    number: Int,
    onClick: () -> Unit
) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}