package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(
    showBackground = true
)
@Composable
fun TaskConstraintLayoutPreview(){
    TaskConstraintLayout(Modifier)
}

@Composable
fun TaskConstraintLayout(
    modifier: Modifier
) {

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {

        val (boxOutCyan, boxOutBlack, boxOutDarkGray, boxOutBlue) = createRefs()
        val (boxMagenta, boxGreen,  boxYellow,boxGray,boxRed) = createRefs()

        Box(Modifier.size(150.dp).background(Color.Cyan).constrainAs(boxOutCyan){
            end.linkTo(boxMagenta.end)
            bottom.linkTo(boxMagenta.top)
        })
        Box(Modifier.size(75.dp).background(Color.Black).constrainAs(boxOutBlack){
            start.linkTo(boxOutCyan.end)
            top.linkTo(boxOutCyan.top)
            bottom.linkTo(boxOutCyan.bottom)
            end.linkTo(boxOutDarkGray.start)
        })
        Box(Modifier.size(150.dp).background(Color.DarkGray).constrainAs(boxOutDarkGray){
            start.linkTo(boxGreen.start)
            bottom.linkTo(boxGreen.top)
        })

        Box(Modifier.size(150.dp).background(Color.Blue).constrainAs(boxOutBlue){
            top.linkTo(boxYellow.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

        Box(Modifier.size(75.dp).background(Color.Magenta).constrainAs(boxMagenta){
            end.linkTo(boxYellow.start)
            bottom.linkTo(boxYellow.top)
        })
        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
            start.linkTo(boxYellow.end)
            bottom.linkTo(boxYellow.top)
        })
        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            top.linkTo(parent.top)
        })
        Box(Modifier.size(75.dp).background(Color.Gray).constrainAs(boxGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })
    }
}