package com.ersubhadip.counter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 0

    fun increase(): Int {
        return count++

    }

    fun resetData(): Int {
        count = 0
        return 0
    }


}