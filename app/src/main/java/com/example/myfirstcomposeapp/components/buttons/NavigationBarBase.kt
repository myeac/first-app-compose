package com.example.myfirstcomposeapp.components.buttons

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcomposeapp.R

data class NavItemModel(
    val name: String,
    val icon: Painter
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyBaseScaffoldNavigationBar(
    modifier: Modifier,
    paddingValues: PaddingValues
) {
    Scaffold(
        modifier = modifier,
        bottomBar = { NavigationBarExample() }
    ) { innerPadding ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text("Esta es mi screen - Navigation Bar")
        }
    }
}

@Composable
fun MyNavigationButtonBar(
    modifier: Modifier = Modifier
) {

    NavigationBar(
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            label = { Text("primera opcion") },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_alarm),
                    contentDescription = ""
                )
            },
            alwaysShowLabel = true,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Red,
                selectedTextColor = Color.Blue,
                indicatorColor = Color.Black
            )
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            label = { Text("segunda opcion") },
            alwaysShowLabel = false,
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_watch),
                    contentDescription = ""
                )
            })
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_shot_fire),
                    contentDescription = ""
                )
            })
    }
}

@Composable
fun NavigationBarExample(
    modifier: Modifier = Modifier
) {
    val itemList = listOf(
        NavItemModel("home", painterResource(R.drawable.ic_alarm)),
        NavItemModel("perfil", painterResource(R.drawable.ic_menu_profile)),
        NavItemModel("exercise", painterResource(R.drawable.ic_weight))
    )

    var selectedIndex by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = Color.Yellow
    ) {
        itemList.forEachIndexed { index, model ->
            NavigationItemScope(
                index == selectedIndex,
                model){
                selectedIndex = index
            }
        }
    }
}

@Composable
fun RowScope.NavigationItemScope(
    isSelected: Boolean,
    navItem: NavItemModel,
    onItemClick: () -> Unit
) {
    NavigationBarItem(
        selected = isSelected,
        onClick = { onItemClick() },
        label = { Text(navItem.name) },
        icon = {
            Icon(
                painter = navItem.icon,
                contentDescription = ""
            )
        },
        alwaysShowLabel = true,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Red,
            selectedTextColor = Color.Blue,
            indicatorColor = Color.Black
        )
    )
}