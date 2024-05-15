package com.example.app_etec.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
@Composable
fun StyledTextField() {
    var text by remember { mutableStateOf("") }

    TextField(
        onValueChange = { text = it },
        value = text,
        label = { Text("Usuário") },
        placeholder = { Text("Nome do usuário") }
    )
}