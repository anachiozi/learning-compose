package com.example.aluvery.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Testing {
    @Preview(showBackground = true)
    @Composable
    private fun TestColPreview() {
        Column {
            Text("Texto 1")
            Text("Texto 2")
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun TestRow() {
        Row {
            Text("Texto 1")
            Text("Texto 2")
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun TestBox() {
        Box {
            Text("Texto 1")
            Text("Texto 2")
        }
    }

    @Preview(
        showBackground = true,
        //showSystemUi = true
    )
    @Composable
    private fun TestCombinationsPreview() {
        Column(
            Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
            /*.fillMaxWidth()
            .fillMaxHeight()*/
        ) {
            Row(
                Modifier
                .padding(all = 8.dp)
                .fillMaxWidth()
                .background(color = Color.White)
            ) {
                Row(
                    Modifier
                    .fillMaxWidth(0.5f)
                    .background(color = Color.Red)
                    .padding(all = 8.dp)
                ) {
                    Text("Texto 1")
                    Text("Texto 2")
                }
                Row(
                    Modifier
                    .fillMaxWidth(0.5f)
                    .background(color = Color.Yellow)
                    .padding(all = 8.dp)
                ) {
                    Text("Texto 1")
                    Text("Texto 2")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun Chalenge() {
        Row(Modifier
            .fillMaxWidth()
        ) {
            Box(Modifier
                .fillMaxWidth(0.2f)
                .height(100.dp)
                .background(color = Color.Blue)
            )
            Column(Modifier
                .fillMaxWidth()
            ) {
                Text(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth()
                    .padding(all = 8.dp),
                    text = "Texto 1"
                )
                Text(modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 8.dp),
                    text = "Texto 2"
                )
            }
        }
    }
}