package com.example.myfirstcomposeapp.components.control

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyControlButtons(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            MySwitch()
            Spacer(Modifier.height(8.dp))
            MyCheckBox()
            Spacer(Modifier.height(8.dp))
            ParentCheckBoxWithText()
            Spacer(Modifier.height(8.dp))
            MyTriStateCheckBox()
            Spacer(Modifier.height(8.dp))
            MyRadioButton()
            Spacer(Modifier.height(8.dp))
            MyRadioButtonList()
        }
    }
}