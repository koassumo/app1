package ru.geekbrains.gb_kotlin

import androidx.lifecycle.MutableLiveData

class Model {
    private var couter = 0
    private val couterLiveData = MutableLiveData<Int>()

    fun counterLiveData (): MutableLiveData<Int> = counterLiveData()

    fun riseCounter () {
        couterLiveData.value = ++couter
    }
}