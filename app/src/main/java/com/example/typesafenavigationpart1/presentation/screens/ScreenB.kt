package com.example.typesafenavigationpart1.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ScreenB(modifier: Modifier = Modifier, onClick: () -> Unit) {

    //take a col
    //inside it make a text
    //and a button

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("I am Screen B and i want to go to Screen A")
        Button(onClick = onClick) {
            Text("Go back to Screen A")
        }
    }

    
}