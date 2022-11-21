package com.mahshook.dynamiccontentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val textfieldState=MutableLiveData("")

    fun onTextChanged(newText:String){
        textfieldState.value=newText
    }

}