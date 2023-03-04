package com.example.fithome.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.fithome.utils.NavigationCommand
import com.example.fithome.utils.Event

class LoginViewModel : ViewModel() {
    private val _navigation = MutableLiveData<Event<NavigationCommand>>()
    val navigation: LiveData<Event<NavigationCommand>> get() = _navigation

    fun navigate(navDirections: NavDirections) {
        _navigation.value = Event(NavigationCommand.ToDirection(navDirections))
    }

    fun navigateBack()
    {
        _navigation.value = Event(NavigationCommand.Back)
    }
}