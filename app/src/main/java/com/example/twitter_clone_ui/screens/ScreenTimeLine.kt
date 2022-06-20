package com.example.twitter_clone_ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitter_clone_ui.components.BottomNavigationBar
import com.example.twitter_clone_ui.components.FloatingButtonAdd
import com.example.twitter_clone_ui.components.Toolbar
import com.example.twitter_clone_ui.components.Tweet
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun ScreenTimeLine(){
    Scaffold(
        floatingActionButton = { FloatingButtonAdd() },
        bottomBar = { BottomNavigationBar() },
    ){ padding ->
        LazyColumn(
            modifier = Modifier.padding(
                top = padding.calculateTopPadding(),
                bottom = padding.calculateBottomPadding()
            )
        ) {
            item {
                Toolbar()
            }
            item {
                Tweet("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivo usar",false, "")
            }
            item {
                Tweet("",true, "https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif")
            }
            item {
                Tweet("",false,"https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif")
            }
            item {
                Tweet("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivo usar",false,"")
            }
            item {
                Tweet("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivo usar",false,"")
            }
            item {
                Tweet("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivo usar",false,"")
            }
            item {
                Tweet("",true, "https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif")
            }
            item {
                Tweet("",true,"https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif")
            }
            item {
                Tweet("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivo usar",false,"")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ScreenTimeLinePreview(){
    Twitter_clone_uiTheme {
        // A surface container using the 'background' color from the theme
        Surface() {
            ScreenTimeLine()
        }
    }
}