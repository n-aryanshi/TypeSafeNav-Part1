package com.example.typesafenavigationpart1.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Routes {


    @Serializable
    data object ScreenA

    @Serializable
    data object ScreenB


}