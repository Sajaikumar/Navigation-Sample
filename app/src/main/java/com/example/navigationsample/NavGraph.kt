package com.example.navigationsample

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationsample.ui.theme.HomeScreen
import com.example.navigationsample.ui.theme.LoginScreen

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A")
    {
        composable(route = "A") {
            SplashScreen(navController)
        }
        composable(route = "C") {
            HomeScreen(navController)
        }
        composable(route = "B") {
            LoginScreen(navController)
        }
    }
}