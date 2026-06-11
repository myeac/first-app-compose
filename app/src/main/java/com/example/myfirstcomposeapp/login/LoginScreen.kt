package com.example.myfirstcomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier
) {

    Text(
        text = "Hello $name",
        modifier = modifier
    )
}

@Preview(
    widthDp = 50,
    heightDp = 50,
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun ExamplePreview() {
    Example("new text ehuehuehu")
}

@Composable
fun Example(
    text: String
) {
    Text(
        text = "Hello $text",
        modifier = Modifier.height(33.dp).width(70.dp)
    )
    Text(
        text = "Hello fixed size $text",
        modifier = Modifier.size(60.dp)
    )
    Text(
        text = "Hello ocupa toda la pantalla $text",
        modifier = Modifier.fillMaxWidth().fillMaxHeight()
    )
    Text(
        text = "Hello ocupa todo $text",
        modifier = Modifier.fillMaxSize()
    )
    Text(
        text = "Hello paddinfg $text",
        modifier = Modifier.padding(all = 40.dp)
    )
    Text(
        text = "Hello paddinfg $text",
        modifier = Modifier.padding(top = 30.dp)
    )
    Text(
        text = "Hello paddinfg $text",
        modifier = Modifier.padding(horizontal = 30.dp)
    )
    Text(
        text = "Hello paddinfg $text",
        modifier = Modifier
            .background(Color.Green)
            .padding(horizontal = 30.dp)
    )
}