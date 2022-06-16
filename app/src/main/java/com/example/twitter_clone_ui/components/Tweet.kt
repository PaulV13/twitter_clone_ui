package com.example.twitter_clone_ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitter_clone_ui.R
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun Tweet(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.background)
        ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape).
                    clickable {  },
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Image profile" )
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row {
                        Text(modifier = Modifier.clickable {  },
                            text = "Tuitbol", style = MaterialTheme.typography.body1,
                            color = MaterialTheme.colors.surface)
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "@FedePraml", style = MaterialTheme.typography.body2)
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "-", style = MaterialTheme.typography.body2)
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "4h", style = MaterialTheme.typography.body2)
                    }
                    Icon(modifier = Modifier
                        .clickable { },
                        tint = Color.Gray,
                        painter = painterResource(id = R.drawable.more),
                        contentDescription = "Icon more")
                }
                Row(modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)) {
                    Text(text = "Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivos usar",
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.surface)
                }
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            modifier = Modifier.clickable {  },
                            tint = Color.Gray,
                            painter = painterResource(id = R.drawable.comment),
                            contentDescription = "Comment icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "16", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier.clickable {  },
                            tint = Color.Gray,
                            painter = painterResource(id = R.drawable.retweet),
                            contentDescription = "Retweet icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "14", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier.clickable {  },
                            tint = Color.Gray,
                            painter = painterResource(id = R.drawable.like),
                            contentDescription = "Like icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "398", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Icon(
                        modifier = Modifier.clickable {  },
                        tint = Color.Gray,
                        painter = painterResource(id = R.drawable.share),
                        contentDescription = "Share icon")
                }
            }
        }
        Divider(color = Color.LightGray)
    }
}


@Preview(showBackground = true, uiMode = 1)
@Composable
fun TweetPreview(){
    Twitter_clone_uiTheme {
        // A surface container using the 'background' color from the theme
        Surface() {
            Tweet()
        }
    }
}