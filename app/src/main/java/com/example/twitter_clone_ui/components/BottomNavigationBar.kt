package com.example.twitter_clone_ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitter_clone_ui.R
import com.example.twitter_clone_ui.screens.ScreenTimeLine
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun BottomNavigationBar(){

    var selected by remember { mutableStateOf("") }

    BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
        BottomNavigationItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "",
            tint = MaterialTheme.colors.surface)},
            label = { Text(text = "")},
            selected = selected == "Home",
            onClick = { selected = "Home" },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "",
                tint = MaterialTheme.colors.surface)},
            label = { Text(text = "")},
            selected = selected == "Search",
            onClick = { selected = "Search" },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.mic),
                contentDescription = "",
                tint = MaterialTheme.colors.surface)},
            label = { Text(text = "")},
            selected = selected == "Mic",
            onClick = { selected = "Mic" },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "",
                tint = MaterialTheme.colors.surface)},
            label = { Text(text = "")},
            selected = selected == "Noti",
            onClick = { selected = "Noti" },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.message),
                contentDescription = "",
                tint = MaterialTheme.colors.surface)},
            label = { Text(text = "")},
            selected = selected == "Message",
            onClick = { selected = "Message" },
            alwaysShowLabel = false
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview(){
    Twitter_clone_uiTheme {
        BottomNavigationBar()
    }
}