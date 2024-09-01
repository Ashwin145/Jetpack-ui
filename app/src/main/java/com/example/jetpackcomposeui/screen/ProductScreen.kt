package com.example.jetpackcomposeui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeui.R
import com.example.jetpackcomposeui.model.Product
import com.example.jetpackcomposeui.screen.components.ProductItem


@Composable

fun ProductScreen() {
    var products = remember {
        getProductList()
    }
    LazyVerticalGrid(columns = GridCells.Fixed(2),modifier = Modifier.padding(8.dp)) {
        items(products){
            ProductItem(product = it)
        }
        
    }

}
fun getProductList() : List<Product>{
    return listOf(
        Product(
            id = "1",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Pink",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.nikepink,
            size = 8

        ),
        Product(
            id = "2",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Blue ",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.nikeairmax,
            size = 8

        ),
        Product(
            id = "3",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Green ",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.nikegreen,
            size = 8

        ),
        Product(
            id = "4",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Red",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.nikered,
            size = 8

        ),
        Product(
            id = "5",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes YELLOW",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.nikeyellow,
            size = 8
        ),
        Product(
            id = "6",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Magenta",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.addidasmagenta,
            size = 8
        ),
        Product(
            id = "7",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.pumablue,
            size = 8
        ),
        Product(
            id = "8",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Green",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.pumagreen,
            size = 8
        ),
        Product(
            id = "9",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Red",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.pumared,
            size = 8
        ),
        Product(
            id = "10",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes yellow",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.pumayellow,
            size = 8
        ),
    )
}

