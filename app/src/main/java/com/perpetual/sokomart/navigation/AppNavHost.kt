package com.perpetual.sokomart.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.perpetual.sokomart.data.UserDatabase
import com.perpetual.sokomart.repository.UserRepository
import com.perpetual.sokomart.ui.screens.about.AboutScreen
import com.perpetual.sokomart.ui.screens.contact.ContactScreen
import com.perpetual.sokomart.ui.screens.form.FormScreen
import com.perpetual.sokomart.ui.screens.home.HomeScreen
import com.perpetual.sokomart.ui.screens.intent.IntentScreen
import com.perpetual.sokomart.ui.screens.item.ItemScreen
import com.perpetual.sokomart.ui.screens.more.MoreScreen
import com.perpetual.sokomart.ui.screens.products.AddProductScreen
import com.perpetual.sokomart.ui.screens.register.LoginScreen
import com.perpetual.sokomart.ui.screens.register.LoginScreen
import com.perpetual.sokomart.ui.screens.service.ServiceScreen
import com.perpetual.sokomart.ui.screens.splash.SplashScreen
import com.perpetual.sokomart.ui.screens.start.StartScreen
import com.perpetual.sokomart.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context= LocalContext.current

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
            MoreScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)

        }
        composable(ROUT_ADDPRODUCT) {
            AddProductScreen(navController)

        }
        composable(ROUT_ADDPRODUCT) {
            EditProductScreen(navController)

        }
        composable(ROUT_PRODUCTLIST) {
            ProductListScreen(navController)

        }
        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }









    }
}

@Composable
fun EditProductScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun EditProductScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun DashboardScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}
