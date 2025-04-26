package com.example.myapplication

import android.R.attr.left
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.widget.ActivityChooserView
import androidx.collection.intIntMapOf
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.google.android.material.internal.ViewUtils
import java.nio.file.WatchEvent


val followButton= Color(0xFF4A5EF9)
val InstagramBlue = Color(0xFF0095F6)



class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->

                    ProfileBody(innerPadding)
                }

            }
        }
    }

@Composable
fun ProfileBody(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            //method1
            Icon(
                painter = painterResource(R.drawable.baseline_arrow_back_24),
                contentDescription = null, modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
            )

            Text(
                text = "realmadrid",
                textAlign = TextAlign.Start,


                style = TextStyle(
                    fontSize = 15.sp,
//                textDecoration = TextDecoration.Underline,

                    fontWeight = FontWeight.Bold,
//                fontStyle = FontStyle.Italic,

                ),
                modifier = Modifier.offset(x = 0.dp, y = 1.dp)
                //method 2
            )

            Text(
                text = "Real Madrid C.F.",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold

                ),
                modifier = Modifier
                    .offset(x = -15.dp, y = 50.dp)
            )


            Image(
                painterResource(R.drawable.verificationmark), null, Modifier
                    //                      .height(15.dp)
                    //                      .width(15.dp)
                    .offset(x = -140.dp, y = 1.dp)
                    .size(20.dp),
                colorFilter = ColorFilter.tint(color = Color.Blue)


            )





            Icon(
                painter = painterResource(R.drawable.baseline_more_vert_24),
                tint = Color.Black,
                contentDescription = null, modifier = Modifier

                    .height(28.dp)
                    .width(28.dp)

            )

        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.realmadrid),
                contentDescription = null,
                contentScale = ContentScale.Crop, //resizing
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(100.dp)) // to make it round

            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "15.7K", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
                    )

                )
                Text(
                    text = "Posts", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,

                    )

                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "173M", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
                    )

                )
                Text(
                    text = "Followers", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
                    )

                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "58", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic
                    )
                )
                Text(
                    text = "Following", style = TextStyle(
                        fontSize = 15.sp,
//                    textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
                    )

                )
            }


        }

        Column(
            modifier = Modifier
                .padding(
                    horizontal = 20.dp,
                    vertical = 10.dp
                ),
            verticalArrangement = Arrangement.SpaceAround

        ) {
            Text(
                text = "⚽ Official profile of Real Madrid C.F.", style = TextStyle(
                    fontSize = 14.sp
                )
            )
            Text(
                text = "\uD83C\uDFC6 15 times European Champions", style = TextStyle(
                    fontSize = 14.sp
                )
            )
            Text(
                text = "\uD83C\uDF0E FIFA Best Club of the 20th Century",
                style = TextStyle(
                    fontSize = 14.sp
                )
            )
            Text(
                "\uD83C\uDFDF\uFE0F  @Bernabeu", style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Blue
                ),
                modifier = Modifier
                    .alpha(0.5f)
            )

            Image(
                painter = painterResource(R.drawable.threadswhitebg),

                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(20.dp)
                    .width(20.dp)
                    .offset(x = 1.dp, y = 13.dp)


            )
            val fontWeight = null
            Text(
                text = "realmadrid",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black,
//                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.SemiBold

                ),
                modifier = Modifier
                    .offset(x = 25.dp, y = -5.dp),


                )
            Text(
                text = "\uD83D\uDCAC Real Madrid C.F.", style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .offset(x = 100.dp, y = -20.dp)
            )

        }
        Column {
            Row {
                Text(
                    text = "Followed by _simon07, _saiman07 and 53 others ", style = TextStyle(
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier
                        .offset(x = 20.dp, y = -15.dp)
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().offset(y = -12.dp)
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,

            ) {
            Button(
                onClick = {
                    //TODO when button is clicked
                }, shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = followButton),
                modifier = Modifier.width(120.dp)
            ) {
                Text(text = "Follow")
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 4.dp),
                    tint = Color.White
                )

            }
            OutlinedButton(
                onClick = {
                    // to do
                }, shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                ),
                modifier = Modifier.width(120.dp)
            ) {
                Text(text = "message")
            }
            OutlinedButton(onClick = {
                // to do
            }, shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                ),
                modifier = Modifier.width(120.dp)


            ) {
                Text(text = "Shop")
            }
//            OutlinedButton(onClick = {
//                //to do
//            }
//            ) {
//                Icon (
//                    imageVector= Icons.Default.KeyboardArrowDown,
//                    contentDescription = null,
//                    tint = Color.Black,
//                    modifier = Modifier
//                        .height(28.dp)
//                        .width(28.dp)
//
//                )
//            }
        }
        Column {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(R.drawable.champions),
                    contentDescription = null,
                    contentScale = ContentScale.Crop, //resizing
                    modifier = Modifier
                        .offset(x=-10.dp,y=1.dp)
                        .height(80.dp)
                        .width(80.dp)
                        .clip(RoundedCornerShape(100.dp)
                            ) // to make it round

                )
                Image(
                    painter = painterResource(R.drawable.supercopa),
                    contentDescription = null,
                    contentScale = ContentScale.Crop, //resizing
                    modifier = Modifier
                        .offset(x=-5.dp,y=1.dp)
                        .height(80.dp)
                        .width(80.dp)
                        .clip(RoundedCornerShape(100.dp)
                        ) // to make it round

                )
                Image(
                    painter = painterResource(R.drawable.thirdkit),
                    contentDescription = null,
                    contentScale = ContentScale.Crop, //resizing
                    modifier = Modifier
                        .offset(x=-2.dp,y=1.dp)
                        .height(80.dp)
                        .width(80.dp)
                        .clip(RoundedCornerShape(100.dp)
                        ) // to make it round

                )
                Image(
                    painter = painterResource(R.drawable.summertour),
                    contentDescription = null,
                    contentScale = ContentScale.Crop, //resizing
                    modifier = Modifier
                        .offset(x=1.dp,y=1.dp)
                        .height(80.dp)
                        .width(80.dp)
                        .clip(RoundedCornerShape(100.dp)
                        ) // to make it round


                )
                Text(text = "#WorldCham9...", style = TextStyle(fontSize = 9.sp,
                    color = Color.Black

                    ), modifier = Modifier
                    .offset(y=100.dp)

                )
                Text(text = "\uD83C\uDFC6 #6SUPERC...", style = TextStyle(fontSize = 9.sp,
                    color = Color.Black

                ), modifier = Modifier
                    .offset(y=90.dp)

                )
                Text(text = "\uD83E\uDD0D THIRD KIT", style = TextStyle(fontSize = 9.sp,
                    color = Color.Black

                ), modifier = Modifier
                    .offset(y=80.dp)

                )
                Text(text = "\uD83C\uDDFA\uD83C\uDDF8SUMEMR T...", style = TextStyle(fontSize = 9.sp,
                    color = Color.Black

                ), modifier = Modifier
                    .offset(y=170.dp)

                )


            }


        }

    }
}



@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
    }






