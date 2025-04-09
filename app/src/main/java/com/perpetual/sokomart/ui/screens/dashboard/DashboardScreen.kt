package com.perpetual.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.perpetual.sokomart.R
import androidx.navigation.compose.rememberNavController
import java.nio.file.WatchEvent

@Composable
fun AboutScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){
        //////card///
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 62.dp, bottomEnd = 62.dp),
            colors = CardDefaults.cardColors(Color.DarkGray)


        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "SokoMart",
                    fontSize = 40.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive

                )
            }
        }
        ///////end of card////

        /////ROW/////
        Row (modifier = Modifier.padding(start = 20.dp)){  }
        /// Card 1 ///
        Card ( modifier = Modifier.width(150.dp).height(180.dp)
        ){
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "Shop",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive

                )



            }


        }



        ////End of 1////

        /////END OF ROW/////

        Spacer(modifier = Modifier.width(20.dp))

        /////ROW2/////
        Row (modifier = Modifier.padding(start = 20.dp)){  }
        /// Card 1 ///
        Card ( modifier = Modifier.width(150.dp).height(180.dp)
        ){
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "Shop",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive

                )



            }


        }



        ////End of 1////
       
    /////END OF ROW2/////

        Spacer(modifier = Modifier.width(20.dp))

        /////ROW3/////
        Row (modifier = Modifier.padding(start = 20.dp)){  }
        /// Card 1 ///
        Card ( modifier = Modifier.width(150.dp).height(180.dp)
        ){
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "Shop",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive

                )



            }


        }



        ////End of 1////

        /////END OF ROW3/////
        Spacer(modifier = Modifier.width(20.dp))

        /////ROW4/////
        Row (modifier = Modifier.padding(start = 20.dp)){  }
        /// Card 1 ///
        Card ( modifier = Modifier.width(150.dp).height(180.dp)
        ){
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "Shop",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive

                )



            }


        }



        ////End of 1////

        /////END OF ROW4/////









































    }






}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController = rememberNavController())
}