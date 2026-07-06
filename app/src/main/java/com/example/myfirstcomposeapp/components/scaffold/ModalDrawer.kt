package com.example.myfirstcomposeapp.components.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

data class DrawerItem(val title: String, val icon: Painter, val notification: Int)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyBaseModalDrawer(
    modifier: Modifier, paddingValues: PaddingValues
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scopeModalDrawer = rememberCoroutineScope()

    MyModalDrawer(modifier, drawerState, scopeModalDrawer) {
        Scaffold(
            modifier = modifier,
            topBar = { MyTopBarClickable(onNavSelected = { scopeModalDrawer.launch { drawerState.open() } }) }) { innerPadding ->
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
}

@Composable
fun MyModalDrawer(
    modifier: Modifier = Modifier,
    drawerState: DrawerState,
    scope: CoroutineScope,
    content: @Composable () -> Unit
) {
    val myItems = listOf(
        DrawerItem(
            title = "Home",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 3
        ),
        DrawerItem(
            title = "Fav",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 2
        ),
        DrawerItem(
            title = "Build",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 7
        ),
        DrawerItem(
            title = "Call",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 9
        ),
        DrawerItem(
            title = "Location",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 0
        ),
        DrawerItem(
            title = "Settings",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 5
        ),
        DrawerItem(
            title = "Close",
            icon = painterResource(R.drawable.ic_shot_fire),
            notification = 0
        ),
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    ModalNavigationDrawer(
        drawerState = drawerState, drawerContent = {
            ModalDrawerSheet(
                drawerShape = RoundedCornerShape(topEndPercent = 16, bottomEndPercent = 16),
                drawerContentColor = Color.Cyan,
                drawerContainerColor = Color.Yellow
            ) {
                Spacer(Modifier.height(44.dp))

                myItems.forEachIndexed { index, item ->
                    NavigationDrawerItem(
                        label = { Text(item.title) },
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = {
                            Icon(
                                painter = item.icon,
                                contentDescription = null
                            )
                        },
                        badge = {
                            if (item.notification > 0)
                                Badge { Text("${item.notification}") }
                        },
                        shape = RoundedCornerShape(percent = 10),
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = Color.Red,
                            selectedIconColor = Color.Blue
                        )
                    )
                }
                NavigationDrawerItem(
                    label = { Text("cerrar") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.ic_shot_fire),
                            contentDescription = null
                        )
                    },
                    badge = {
                        Badge {
                            Icon(
                                painter = painterResource(R.drawable.ic_swimming),
                                contentDescription = null
                            )
                        }
                    },
                    shape = RoundedCornerShape(percent = 10),
                    colors = NavigationDrawerItemDefaults.colors(
                        selectedContainerColor = Color.Red,
                        selectedIconColor = Color.Blue,
                        selectedTextColor = Color.White,
                        selectedBadgeColor = Color.Magenta,
                        unselectedContainerColor = Color.White
                    )
                )
            }
        }, scrimColor = Color.Blue.copy(alpha = 0.7f)
    ) {
        content()
    }
}