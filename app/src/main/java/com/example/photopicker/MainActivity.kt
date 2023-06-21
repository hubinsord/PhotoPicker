package com.example.photopicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.photopicker.ui.home.HomeScreen
import com.example.photopicker.ui.photodetails.PhotoDetailsScreen
import com.example.photopicker.ui.theme.PhotoPickerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotoPickerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.Home.name
                ) {
                    composable(Screens.Home.name) {
                        HomeScreen(navController = navController)
                    }
                    composable(Screens.PhotoDetails.name) {
                        PhotoDetailsScreen(navController = navController)
                    }
                }
            }
        }
    }
}

sealed class Screens(val name: String) {
    object Home : Screens("home_screen")
    object PhotoDetails : Screens("photo_details_screen")
}


