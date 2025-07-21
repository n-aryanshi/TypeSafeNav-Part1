package com.example.typesafenavigationpart1.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.typesafenavigationpart1.presentation.screens.ScreenA
import com.example.typesafenavigationpart1.presentation.screens.ScreenB

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier) {

    NavHost(
        navController = navController,
        startDestination = Routes.ScreenA
    ){
        composable<Routes.ScreenA>{
            ScreenA { navController.navigate(Routes.ScreenB) }
        }
        composable<Routes.ScreenB>{
            ScreenB { navController.popBackStack() }
        }
    }
}