package com.example.myfirstcomposeapp.components.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun ScaffoldWithSnackBarComponent(
    modifier: Modifier,
    paddingValues: PaddingValues
) {
    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { MyTopAppBar() },
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
    ) { _ ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center,
        ) {
            Column {
                Text(
                    "Esta es mi screen",
                    modifier = Modifier.clickable {
                        scope.launch {
                            snackBarHostState.showSnackbar(
                                message = "Ejemplo 1",
                                actionLabel = "cerrar"
                            )
                        }
                    }
                )
                Text(
                    "snackbar deshacer",
                    modifier = Modifier.clickable {
                        scope.launch {
                            val result = snackBarHostState.showSnackbar(
                                message = "ejecutado con exito",
                                actionLabel = "deshacer"
                            )
                            if (result == SnackbarResult.ActionPerformed) {
                                snackBarHostState.currentSnackbarData?.dismiss()
                                //ocurrio alguna cosa - rollback
                                snackBarHostState.showSnackbar("accion deshecha")
                            }
                        }
                    }
                )
            }
        }
    }
}