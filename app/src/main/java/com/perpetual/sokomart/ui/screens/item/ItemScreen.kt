package com.perpetual.sokomart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.perpetual.sokomart.R
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        //TopAppBar
        TopAppBar(
            title = { Text(text = "ITEM") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Magenta,
                titleContentColor = Color.Black,
                navigationIconContentColor = Color.Gray,
                actionIconContentColor = Color.Gray

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            },




        )
        //End of TopAppBar


        Image(
            painter = painterResource(R.drawable.item),
            contentDescription ="home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth,

        )

        Spacer(modifier = Modifier.height(10.dp))

        ///////Search Bar/////
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Search,contentDescription = "")},
            placeholder = {Text(text = "Search....")}



        )


          ///End Search Bar/////

        Spacer(modifier = Modifier.height(10.dp))

        ////ROW///
        Row (){

            Image(
                painter = painterResource(R.drawable.food1),
                contentDescription ="home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)).padding(start = 20.dp),
                contentScale = ContentScale.FillWidth
            )
            Column {
                Text(
                    text = "Sarava Chicken Breasts",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Text(text = "A very remarkable and enjoyable meal",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                    )
                Text(text = "3000",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                    )
                Text(text = "Now!!! 2400",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                )


                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700) // Gold/Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                }












            }
        }
        ///END OF ROW ////


        Spacer(modifier = Modifier.height(10.dp))

        ////ROW///2
        Row (){

            Image(
                painter = painterResource(R.drawable.food2),
                contentDescription ="home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)).padding(start = 20.dp),
                contentScale = ContentScale.FillWidth
            )
            Column {
                Text(
                    text = "Sarava Meatballs",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Text(text = "We serve both wet and fry meatballs of your choice ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                )
                Text(text = "4300",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(text = "Now!!! 3300",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                )



                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700) // Gold/Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color.LightGray
                    )
                }












            }
        }
        ///END OF ROW ////2


        Spacer(modifier = Modifier.height(10.dp))

        ////ROW///3
        Row (){

            Image(
                painter = painterResource(R.drawable.food3),
                contentDescription ="home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)).padding(start = 20.dp),
                contentScale = ContentScale.FillWidth
            )
            Column {
                Text(
                    text = "Sarava Sea Food",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Text(text = "Our sea food are made from the best chef",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                )
                Text(text = "5000",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(text = "Now!!! 3000",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp

                )


                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700) // Gold/Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color(0xFFFFD700)

                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color.LightGray
                    )
                }














            }
        }
        ///END OF ROW ////3






























    }

}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController = rememberNavController())
}