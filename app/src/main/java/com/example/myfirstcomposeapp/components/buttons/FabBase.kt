package com.example.myfirstcomposeapp.components.buttons

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyBaseScaffoldFAB(
    modifier: Modifier,
    paddingValues: PaddingValues
) {
    Scaffold(
        modifier = modifier,
        floatingActionButton = { MyFloatingActionButton() },
        floatingActionButtonPosition = FabPosition.Start
    ) { innerPadding ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text("Esta es mi screen - FAB")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyFloatingActionButton(
    modifier: Modifier = Modifier
) {
    Column {
        FloatingActionButton(
            modifier = modifier.padding(4.dp),
            onClick = {}) {
            Icon(
                painter = painterResource(R.drawable.ic_watch),
                contentDescription = null
            )
        }
        FloatingActionButton(
            modifier = modifier.padding(4.dp),
            onClick = {},
            shape = CircleShape,
            contentColor = Color.Magenta,
            containerColor = Color.Blue
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_shot_fire),
                contentDescription = null
            )
        }
        FloatingActionButton(
            modifier = modifier.padding(4.dp),
            onClick = {},
            shape = RoundedCornerShape(percent = 10),
            elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 12.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_alarm),
                contentDescription = null
            )
        }
    }

}