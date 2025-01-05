package com.example.aluvery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.extensions.toBrCurrency
import com.example.aluvery.model.Product
import com.example.aluvery.ui.theme.Purple40
import com.example.aluvery.ui.theme.PurpleGrey80
import java.math.BigDecimal

@Composable
//fun ProductItem(descript : String? = null) {
fun ProductItem(product: Product) {
    Surface(
        //Modifier.padding(4.dp),
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp) {

        Column(
            Modifier
                .width(200.dp)
                .heightIn(250.dp, 300.dp)
                .verticalScroll(rememberScrollState())
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
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Image(
                    painterResource(product.image),
                    contentDescription = "Imagem do produto",
                    Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(Modifier.height(50.dp))

            Column(Modifier.padding(16.dp)) {
                Text(
                    product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    //product.price.toPlainString(),
                    product.price.toBrCurrency(),
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )

                /*descript?.let { desc ->
                    Column(
                        Modifier
                            .padding(top = 5.dp)
                            .fillMaxHeight()
                    ) {
                        DescriptionProductItem(desc)
                    }
                }*/
            }
        }
    }
}

@Composable
fun DescriptionProductItem(desc: String) {
    Text(
        modifier = Modifier
            .background(color = Purple40)
            .padding(8.dp),
        text = desc,
        color = Color.White
    )
}

@Preview(showBackground = true)
@Composable
private fun DescriptionProductItemPreview() {
    DescriptionProductItem("Test")
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(Product(
        name = LoremIpsum(50).values.first(),
        price = BigDecimal("14.99"),
        image = R.drawable.placeholder
    ))
}