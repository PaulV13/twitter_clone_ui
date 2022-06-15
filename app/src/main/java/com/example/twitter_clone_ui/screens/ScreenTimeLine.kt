package com.example.twitter_clone_ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitter_clone_ui.components.Toolbar
import com.example.twitter_clone_ui.components.Tweet
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun ScreenTimeLine(){
    Scaffold(
        topBar = { Toolbar() },
        content = { Tweet() }
    )
}


@Preview(showBackground = true)
@Composable
fun ScreenTimeLinePreview(){
    Twitter_clone_uiTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            ScreenTimeLine()
        }
    }
}