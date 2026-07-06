package com.example.myfirstcomposeapp.components.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun MyTextsPreview() {
    MyTexts(Modifier.fillMaxSize())
}

@Composable
fun MyTexts(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "test de texto",
            modifier = Modifier.padding(top = 42.dp, start = 16.dp)
        )
        Text(
            text = "texto en rojo",
            color = Color.Red, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "otro example ehjehe",
            fontSize = 32.sp, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "fontstyle example",
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "fontweight example",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            "letter spacing example",
            letterSpacing = 20.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            "text decoration heuheu",
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            "align , align align , align , align  , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align , align align , align, align , align , align align , align , align align , align , align align , align , align align , align",
            textAlign = TextAlign.Center,
            maxLines = 2,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .padding(16.dp),
            overflow = TextOverflow.Ellipsis
        )
    }
}