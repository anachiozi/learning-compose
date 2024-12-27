package com.example.aluvery

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme
import com.example.aluvery.ui.theme.Purple40
import com.example.aluvery.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AluveryTheme {
                Surface {
                    HelloWorld()
                }
            }
        }
    }
}

@Composable
fun HelloWorld() {
    Text("Olá, mundo")
}

@Preview(
    name="Phone",
    showBackground = true
)
@Composable
fun HelloWorldPreview() {
    AluveryTheme {
        Surface {
            HelloWorld()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItem() {
    Column(Modifier
        .width(250.dp)
        .height(200.dp)
    ) {
        Box(
            Modifier
                .background(brush = Brush.horizontalGradient(listOf(
                    Purple40, PurpleGrey80
                )))
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Image(
                painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Imagem do produto",
                Modifier
                    .size(100.dp)
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }

        Text("Nome do produto")
        Text("R$ Preço")
    }
}