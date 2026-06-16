package com.example.myfirstcomposeapp.components.slider

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.RangeSliderState
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySliderBase(
    modifier: Modifier = Modifier
) {

    var myValue by remember { mutableFloatStateOf(0f) }

    Column(
        modifier = modifier.padding(horizontal = 68.dp)
    ) {
        Text("common and base slider")
        Slider(
            value = myValue,
            onValueChange = { myValue = it },
            colors = SliderDefaults.colors(
                thumbColor = Color.Red,
                activeTrackColor = Color.Blue,
                activeTickColor = Color.Green,
                inactiveTrackColor = Color.Magenta,
                inactiveTickColor = Color.Cyan
            )
        )
        Text("valor: $myValue")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySliderAdvanced(
    modifier: Modifier = Modifier
) {
    var example by remember { mutableStateOf(":(") }
    val state = remember {
        SliderState(
            value = 5f,
            valueRange = 0f..10f,
            steps = 9,
            onValueChangeFinished = { example = "feliz" }
        )
    }
    Column(
        modifier = modifier.padding(horizontal = 32.dp)
    ) {
        Text("Advanced slider")
        Slider(state)
        Text("state: $example")
        Text("valor: ${state.value}")
    }
}

@SuppressLint("DefaultLocale")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyRangedSlider(
    modifier: Modifier = Modifier
) {
    val state = remember {
        RangeSliderState(
            activeRangeStart = 5f,
            activeRangeEnd = 6f,
            valueRange = 0f..10f,
            steps = 8,
            onValueChangeFinished = {}
        )
    }
    Column(
        modifier.padding(horizontal = 16.dp)
    ) {
        RangeSlider(
            state = state,
            startThumb = {
                Box(
                    Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Green),
                    contentAlignment = Alignment.Center
                ) { Text(String.format("%.1f", it.activeRangeStart)) }
            })
    }
}