package com.perpetual.sokomart.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.perpetual.sokomart.ui.screens.about.AboutScreen
import com.perpetual.sokomart.ui.screens.home.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_MORE) {
            AboutScreen(navController)
        }
        composable(ROUT_INTENT) {
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            AboutScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            AboutScreen(navController)
        }

    }
}
