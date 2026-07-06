package com.example.myfirstcomposeapp.components.scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


/**
 *  --inside the main activity, configuration for the scaffold--
 *
 *    setContent {
 *        val baseModifier = Modifier.fillMaxSize()
 *        MyFirstComposeAppTheme {
 *            Scaffold(
 *                modifier = baseModifier,
 *                topBar = { MyTopAppBar() }
 *            ) { innerPadding ->
 *                MyBaseScaffold(
 *                    modifier = baseModifier,
 *                    paddingValues = innerPadding
 *                )
 *            }
 *        }
 *    }
 */


@Composable
fun MyBaseScaffold(
    modifier: Modifier,
    paddingValues: PaddingValues
) {
    Box(
        modifier = modifier
            .padding(paddingValues)
            .background(Color.Cyan)
        ,
        contentAlignment = Alignment.Center
    ) {
        Text("Esta es mi screen")
    }
}
