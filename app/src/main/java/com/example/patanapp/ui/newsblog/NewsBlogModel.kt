package com.example.patanapp.ui.newsblog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsBlogModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Newsblog Fragment"
    }
    val text: LiveData<String> = _text
}