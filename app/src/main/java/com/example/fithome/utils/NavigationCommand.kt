package com.example.fithome.utils

import androidx.navigation.NavDirections

open class NavigationCommand {
    data class ToDirection(val directions: NavDirections) : NavigationCommand()
    object Back : NavigationCommand()
}