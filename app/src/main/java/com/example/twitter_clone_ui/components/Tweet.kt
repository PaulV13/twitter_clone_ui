package com.example.twitter_clone_ui.components

import android.os.Build.VERSION.SDK_INT
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Autorenew
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.Coil
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.example.twitter_clone_ui.R
import com.example.twitter_clone_ui.ui.theme.Twitter_clone_uiTheme


@Composable
fun Tweet(
    text: String,
    image: Boolean,
    imageUrl: String
){
    val imageLoader = ImageLoader.Builder(LocalContext.current)
        .components {
            if (SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Coil.setImageLoader(imageLoader)

    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.background)
        ) {
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(modifier = Modifier.padding(8.dp)) {
            Box(modifier = Modifier.padding(8.dp)) {
                Image(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .clickable { },
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Image profile" )
            }
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
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)) {
                        if(text.isNotEmpty()){
                            Text(text = text,
                                fontSize = 16.sp,
                                style = MaterialTheme.typography.body1,
                                color = MaterialTheme.colors.surface)
                        }
                        if(image){
                            AsyncImage(
                                model = imageUrl,
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .align(Alignment.CenterHorizontally)
                            )
                        }
                    }
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
                            Icons.Outlined.Autorenew,
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
                            Icons.Outlined.FavoriteBorder,
                            tint = Color.Gray,
                            contentDescription = "Like icon")
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "398", style = MaterialTheme.typography.body2)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Icon(
                        Icons.Outlined.Share,
                        modifier = Modifier.clickable {  },
                        tint = Color.Gray,
                        contentDescription = "Share icon")
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun TweetPreview(){
    Twitter_clone_uiTheme {
        // A surface container using the 'background' color from the theme
        Surface() {
            Tweet("", true, "https://educacion30.b-cdn.net/wp-content/uploads/2019/06/homer.gif")
        }
    }
}