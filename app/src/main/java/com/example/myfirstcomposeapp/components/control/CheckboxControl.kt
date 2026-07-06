package com.example.myfirstcomposeapp.components.control

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.components.models.CheckBoxState

@Composable
fun MyCheckBox(
    modifier: Modifier = Modifier
) {
    var state by remember { mutableStateOf(true) }

    Column(
        modifier = modifier
    ) {
        Text("Checkbox - toggle")
        Checkbox(
            checked = state, onCheckedChange = { state = it })
        Checkbox(
            checked = state, onCheckedChange = { state = it }, colors = CheckboxDefaults.colors(
                checkedColor = Color.Red,
                checkmarkColor = Color.Magenta,
                uncheckedColor = Color.Blue,
            )
        )
    }
}

@Composable
fun ParentCheckBoxWithText(
    modifier: Modifier = Modifier
) {

    var state by remember {
        mutableStateOf(
            listOf(
                CheckBoxState("terms", "aceptar temrinos"),
                CheckBoxState("newsletter", "recibir informaciones", true),
                CheckBoxState("updates", "recibir actualziaciones")
            )
        )
    }

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text("Checkbox - terms")
        state.forEach { myState ->
            CheckboxWithText(checkboxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun CheckboxWithText(
    modifier: Modifier = Modifier,
    checkboxState: CheckBoxState,
    onCheckedChange: (CheckBoxState) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable { onCheckedChange(checkboxState) }) {
        Checkbox(
            checked = checkboxState.checked,
            onCheckedChange = { onCheckedChange(checkboxState) },
            enabled = true
        )
        Spacer(Modifier.width(12.dp))
        Text(text = checkboxState.label)
    }
}

@Composable
fun MyTriStateCheckBox(
    modifier: Modifier = Modifier
) {
    var parentState by remember { mutableStateOf(ToggleableState.Off) }
    var child1 by remember { mutableStateOf(false) }
    var child2 by remember { mutableStateOf(false)}

        LaunchedEffect(child1, child2) {
            parentState = when{
                child1 && child2 -> ToggleableState.On
                !child1 && !child2 -> ToggleableState.Off
                else -> ToggleableState.Indeterminate
            }
        }

    Column(modifier = modifier) {
        Text("Checkbox - Tristate checkbox")
        Row(verticalAlignment = Alignment.CenterVertically) {
            TriStateCheckbox(parentState , onClick = {
                val newState = parentState != ToggleableState.On
                child1 = newState
                child2 = child1
            })
            Text("parent of all")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(child1, onCheckedChange = { child1 = it })
            Text("ejemplo 1")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(child2, onCheckedChange = { child2 = it })
            Text("ejemplo 2")
        }
    }
}