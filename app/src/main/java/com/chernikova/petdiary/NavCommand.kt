package com.chernikova.petdiary

import androidx.navigation.NavDirections

sealed class NavCommand{

    class Navigate(val directions: NavDirections) : NavCommand()

    class GoBack(val backTo: Int = -1) : NavCommand()
}

