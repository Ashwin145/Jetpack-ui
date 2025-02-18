package com.example.jetpackcomposeui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeui.R
import com.example.jetpackcomposeui.model.Product
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector


@Preview(showBackground = true)
@Composable
fun ProductItem(
    product: Product = Product(
        id = "1",
        color = Color.Magenta,
        price = 1200f,
        name = "Shoes Pink",
        discountPrice = 1000f,
        rating = 4.7f,
        imageRes = R.drawable.nikepink,
        size = 8

    )
) {
    var color by remember{
        mutableStateOf(product.color)
    }
    var isFavourite by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier
        .padding(20.dp)
        .size(168.dp, 210.dp)) {
        Box(modifier = Modifier
            .fillMaxSize()
            .alpha(.2f)
            .background(color = color, shape = RoundedCornerShape(22.dp)))

        IconButton(
            onClick = {
            isFavourite = !isFavourite
        },
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Icon(imageVector =
                if(isFavourite)
                    Icons.Rounded.Favorite
                else
                    Icons.Rounded.FavoriteBorder
                , contentDescription = null
            )

        }
    }
}

