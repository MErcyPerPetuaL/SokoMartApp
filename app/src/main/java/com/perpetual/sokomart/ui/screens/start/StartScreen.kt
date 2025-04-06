package com.perpetual.sokomart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.perpetual.sokomart.R
import java.nio.file.WatchEvent


@Composable
fun StartScreen(navController: NavController){

    Column (
       modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Text(text = "Welcome ")


        Image(
            painter = painterResource(R.drawable.startscreen),
            contentDescription ="start",
            modifier = Modifier.size(300.dp).clip(shape=CircleShape),
            contentScale = ContentScale.Crop
        )



        Text( text = "Find your order",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta,


        )

        Text(text ="Uber Eats makes it easy to discover new and nearby places to eat in Nairobi. Browse tons of food delivery options, place your order, and track it by the minute." ,
            fontSize = 24.sp,
            


            )






    }



}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController = rememberNavController())
}


