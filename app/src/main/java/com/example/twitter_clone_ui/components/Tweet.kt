package com.example.twitter_clone_ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
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
                    Icon(
                        Icons.Outlined.MoreVert,
                        modifier = Modifier.clickable { },
                        tint = Color.Gray,
                        contentDescription = "Icon more")
                }
                Row(modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)) {
                    Text(text = buildAnnotatedString {
                        append("Ayer compre 1/4 de cafe en un lugar nuevo y lo acabo de preparar. Simplemente delicioso. No se que adjetivos usar ")
                        withStyle(style = SpanStyle(MaterialTheme.colors.onSurface)) {
                            append("@lijal")
                        }
                    },
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.surface)
                }
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(
                        modifier = Modifier.clickable {  },
                        verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            tint = Color.Gray,
                            painter = painterResource(id = R.drawable.comment),
                            contentDescription = "Comment icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "16", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Row(
                        modifier = Modifier.clickable {  },
                        verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.Autorenew,
                            tint = Color.Gray,
                            contentDescription = "Retweet icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "14", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Row(
                        modifier = Modifier.clickable {  },
                        verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.FavoriteBorder,
                            tint = Color.Gray,
                            contentDescription = "Like icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "398", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Icon(
                        Icons.Filled.Share,
                        modifier = Modifier.clickable {  },
                        tint = Color.Gray,
                        contentDescription = "Share icon")
                }
            }
        }
        Divider(color = Color.LightGray, thickness = 0.5.dp)
    }
}


@Preview(showBackground = true)
@Composable
fun TweetPreview(){
    Twitter_clone_uiTheme {
        // A surface container using the 'background' color from the theme
        Surface() {
            Tweet()
        }
    }
}