package com.example.kotlinhelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinhelloworld.ui.theme.KotlinHelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinHelloWorldTheme {
                Surface(modifier = Modifier.padding(10.dp).fillMaxSize()) {
                    Greeting(
                        name = "Rafael Andres Vargas Mamani",
                        subject = "Aplicaciones Moviles",
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, subject: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 60.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = subject,
            fontSize = 36.sp,
            lineHeight = 36.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    KotlinHelloWorldTheme {
        Greeting(name = "Rafael Andres Vargas Mamani", subject = "Aplicaciones moviles")
    }
}