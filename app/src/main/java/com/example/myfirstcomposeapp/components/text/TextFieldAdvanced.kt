package com.example.myfirstcomposeapp.components.text

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun MyTextFieldAdvanced(
    modifier: Modifier
) {
    var user by remember { mutableStateOf("Test") }
    var value by remember { mutableStateOf("") }

    Column(
        modifier = modifier
    ) {
        MyFieldAdvanced(value = value) { value = it }
    }
}

@Composable
fun MyFieldAdvanced(
    value: String, onValueChange: (String) -> Unit
) {
    TextField(
        value = "que tiene un label",
        onValueChange = { onValueChange(it) },
        label = { Text("texto de label") })
    TextField(value = value, onValueChange = {
        onValueChange(it)
    }, placeholder = { Text("place holder test") })
    TextField(value = value, onValueChange = { onValueChange(it) }, label = { Text("label test") })

    MyPasswordTextField(value) { onValueChange(it) }
    Spacer(Modifier.height(20.dp))
    MyOutlinedTextField(value) { onValueChange(it) }
}

@Composable
fun MyPasswordTextField(
    value: String, onValueChange: (String) -> Unit
) {
    var passwordHidden by remember { mutableStateOf(true) }

    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text(text = "add password") },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = if (passwordHidden)
            PasswordVisualTransformation() else
            VisualTransformation.None,
        trailingIcon = {
            Text(
                text = if (passwordHidden) "Show" else "Hide",
                modifier = Modifier
                    .clickable { passwordHidden = !passwordHidden }
                    .padding(12.dp)
            )
        }
    )
}