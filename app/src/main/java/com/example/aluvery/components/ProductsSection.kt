package com.example.aluvery.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

@Composable
fun ProductsSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
        )

        Row(
            Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            //Spacer(Modifier)
            for (p in products) {
                ProductItem(product = p)
            }
            //Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true/*, widthDp = 1000*/)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection("Promoções", sampleProducts)
}

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("24.50"),
        image = R.drawable.cheeseburger
    ),

    Product(
        name = "Pizza",
        price = BigDecimal("24.50"),
        image = R.drawable.pizza
    ),

    Product(
        name = "Batata frita",
        price = BigDecimal("24.50"),
        image = R.drawable.fries
    )
)