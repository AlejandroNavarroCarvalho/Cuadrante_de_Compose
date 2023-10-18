package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteEntero()
                }
            }
        }
    }
}

@Composable
fun CuadranteEntero(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Row (
            modifier = modifier.weight(1f)
        ){
            Cuadrante("Text composable", "Displays text and follows the recommended Material Design guidelines.", 0xFFEADDFF ,modifier.weight(1f).fillMaxHeight())
            Cuadrante( "Image composable", "Creates a composable that lays out and draws a given Painter class object.", 0xFFD0BCFF, modifier.weight(1f).fillMaxHeight())
        }
        Row (
            modifier = modifier.weight(1f)
        ){
            Cuadrante("Row composable", "A layout composable that places its children in a horizontal sequence.", 0xFFB69DF8, modifier.weight(1f).fillMaxHeight())
            Cuadrante("Column composable", "A layout composable that places its children in a vertical sequence.", 0xFFF6EDFF, modifier.weight(1f).fillMaxHeight())
        }
    }
}
@Composable
fun Cuadrante(title: String, definicion: String, color: Long, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .background(Color(color))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = definicion,
            modifier = Modifier,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        CuadranteEntero()
    }
}