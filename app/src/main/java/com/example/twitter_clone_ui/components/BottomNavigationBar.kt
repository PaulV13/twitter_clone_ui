package com.example.twitter_clone_ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun BottomNavigationBar(){

    var selected by remember { mutableStateOf("Home") }

    BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
        BottomNavigationItem(
            icon = {
                Icon(
                    if (selected == "Home") Icons.Rounded.Home else Icons.Outlined.Home,
                    modifier = Modifier.size(24.dp),
                    contentDescription = "",
            tint = MaterialTheme.colors.surface)},
            selected = selected == "Home",
            onClick = { selected = "Home" },
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    if (selected == "Search") Icons.Rounded.Search else Icons.Outlined.Search,
                    modifier = Modifier.size(if (selected == "Search") 28.dp else 24.dp),
                    contentDescription = "",
                    tint = MaterialTheme.colors.surface)},
            selected = selected == "Search",
            onClick = { selected = "Search" },
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    if (selected == "Mic") Icons.Rounded.Mic else Icons.Outlined.Mic,
                    modifier = Modifier.size(if (selected == "Mic") 28.dp else 24.dp),
                    contentDescription = "",
                    tint = MaterialTheme.colors.surface)},
            selected = selected == "Mic",
            onClick = { selected = "Mic" },
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    if (selected == "Noti") Icons.Rounded.Notifications else Icons.Outlined.Notifications,
                    modifier = Modifier.size(24.dp),
                    contentDescription = "",
                    tint = MaterialTheme.colors.surface)},
            selected = selected == "Noti",
            onClick = { selected = "Noti" },
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    if (selected == "Message") Icons.Rounded.Email else Icons.Outlined.Email,
                    modifier = Modifier.size(24.dp),
                    contentDescription = "",
                    tint = MaterialTheme.colors.surface)},
            selected = selected == "Message",
            onClick = { selected = "Message" },
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