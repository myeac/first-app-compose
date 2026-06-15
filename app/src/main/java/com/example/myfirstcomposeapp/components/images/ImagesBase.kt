package com.example.myfirstcomposeapp.components.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.R

@Composable
fun MyImagesBase(
    modifier: Modifier
) {
    Row(modifier) {
        ImagesWithSizeStructure()
        Spacer(Modifier.width(10.dp))
        ImagesWithClip()
        Spacer(Modifier.width(10.dp))
        MyImageWithUrlCoil()
    }
}

@Composable
fun ImagesWithSizeStructure(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.Fit
        )
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.FillHeight
        )
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.FillWidth
        )
        Image(
            painter = painterResource(R.drawable.ic_menu_profile),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .height(200.dp)
                .width(100.dp),
            contentScale = ContentScale.Inside  //just fits
        )
    }

}

@Composable
fun ImagesWithClip(
    modifier: Modifier = Modifier
) {
    Column() {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(15)),
            contentScale = ContentScale.Fit
        )
        Spacer(Modifier.height(24.dp))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(24.dp)),
            contentScale = ContentScale.Fit
        )
        Spacer(Modifier.height(24.dp))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .size(100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 24.dp,
                        bottomEnd = 10.dp
                    )
                )
                .border(
                    width = 5.dp,
                    shape = CircleShape,
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Red, Color.Blue, Color.Green)
                    )
                ),
            contentScale = ContentScale.Fit
        )
    }
}