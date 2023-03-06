package com.example.fithome.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ButtonStateViewModel : ViewModel() {
    private val _isLoginClicked = MutableLiveData<Boolean>()
    val isLoginClicked: LiveData<Boolean>
        get() = _isLoginClicked

    private val _isGuestClicked = MutableLiveData<Boolean>()
    val isGuestClicked: LiveData<Boolean>
        get() = _isGuestClicked

    fun changeLoginState(buttonClicked: Boolean)
    {
        _isLoginClicked.value = buttonClicked
    }

    fun changeGuestState(buttonClicked: Boolean)
    {
        _isGuestClicked.value = buttonClicked
    }
}