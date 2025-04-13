package com.perpetual.sokomart.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.perpetual.sokomart.R
import com.perpetual.sokomart.ui.theme.Newblack
import com.perpetual.sokomart.ui.theme.Newred
import com.perpetual.sokomart.navigation.ROUT_DASHBOARD
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(2500)
        navController.navigate(ROUT_DASHBOARD)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Newred),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.splash),
            contentDescription = "Sokomart logo",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Sokomart",
            fontSize = 60.sp,
            color = Newblack,
            fontFamily = FontFamily.Cursive
        )

        Text(
            text = "Your best online shop",
            fontSize = 40.sp,
            color = Newblack,
            fontFamily = FontFamily.Cursive
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(navController = rememberNavController())
}
