package com.example.twitter_clone_ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitter_clone_ui.R
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme

@Composable
fun Toolbar(){
    TopAppBar(
        content = {
            Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        modifier = Modifier.size(24.dp).clip(CircleShape),
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(32.dp),
                        painter = painterResource(id = R.drawable.stars),
                        tint = MaterialTheme.colors.surface,
                        contentDescription = "")
                }
            }
        },
        backgroundColor = MaterialTheme.colors.background
    )
}



@Preview(showBackground = true)
@Composable
fun ScreenTimeLinePreview(){
    Twitter_clone_uiTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) {
            Toolbar()
        }
    }

}