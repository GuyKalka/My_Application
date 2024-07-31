package com.example.my_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_application.ui.theme.My_ApplicationTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_ApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(
                            name = "Guy",
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        ButtonPositioningExamples()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to the allergy social network, $name!",
        modifier = modifier
    )
}

@Composable
fun ButtonPositioningExamples() {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = { /* Do something */ },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Centered Button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_ApplicationTheme {
        Column {
            Greeting("Guy")
            ButtonPositioningExamples()
        }
    }
}