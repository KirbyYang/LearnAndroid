package com.yzh.learnandroid.bottomnavigation.ui.airplane

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by YZH on 2020/9/2.
 * From the BaoBao project
 * @author YZH
 */
class AirplaneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is airplane fragment"
    }
    val text: LiveData<String> = _text
}