package com.example.myfirstcomposeapp.components.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun MyTextFieldPreview() {
    MyTextFieldParent(Modifier.fillMaxSize())
}

@Composable
fun MyTextFieldParent(
    modifier: Modifier
) {
    var user by remember { mutableStateOf("") }
    Column(modifier) {
        MyTextField(user = user) { user = it }
    }
}

@Composable
fun MyTextField(
    user: String,
    onUserChange: (String) -> Unit
) {
    TextField(
        value = user,
        onValueChange = { onUserChange(it) },
        placeholder = { Text("place holder here") }
    )
    TextField(
        value = "bloqueado",
        onValueChange = { onUserChange(it) },
        readOnly = true
    )
    TextField(
        value = "que tiene un label",
        onValueChange = { onUserChange(it) },
        label = { Text("texto de label") }
    )
}