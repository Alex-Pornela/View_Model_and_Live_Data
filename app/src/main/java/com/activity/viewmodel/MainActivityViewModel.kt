package com.activity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    //Initaialize mutable live data
    var count = MutableLiveData<Int>()

    //use init block to provide intial value of count variable
    init {
        count.value = 0
    }

    fun updateCount(){
        //get current value and add 1 to it
        //use safe call operator to avoid null point exception
        count.value = (count.value)?.plus(1)


    }
}