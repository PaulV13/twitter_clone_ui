package com.example.twitter_clone_ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun FloatingButtonAdd(){
    FloatingActionButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        backgroundColor = MaterialTheme.colors.onSurface,
    ) {
        Icon(
            Icons.Outlined.Add,
            tint = Color.White,
            contentDescription = "Icon more")
    }
}