package com.example.aluvery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.ui.theme.Purple40
import com.example.aluvery.ui.theme.PurpleGrey80

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

    @Preview(showBackground = true)
    @Composable
    private fun ProductItemChalenge() {
        Surface(
            Modifier.padding(4.dp),
            shape = RoundedCornerShape(15.dp),
            shadowElevation = 4.dp) {

            Row(
                Modifier
                    .height(200.dp)
                    .widthIn(250.dp, 300.dp)
            ) {

                val imageSize = 100.dp

                Box(
                    Modifier
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Purple40, PurpleGrey80
                                )
                            )
                        )
                        .fillMaxHeight()
                        .width(100.dp)
                ) {
                    Image(
                        painterResource(R.drawable.ic_launcher_background),
                        contentDescription = "Imagem do produto",
                        Modifier
                            .size(imageSize)
                            .offset(x = imageSize/2)
                            .clip(shape = CircleShape)
                            .align(Alignment.Center)
                    )
                }

                Spacer(Modifier.width(50.dp))

                Column(Modifier.padding(16.dp)) {
                    Text(
                        LoremIpsum(50).values.first(),
                        fontSize = 18.sp,
                        maxLines = 6,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }
}