package com.example.oopsconcept

abstract class MyAbstractClass(private val price: Int, itemName: String? =null) {
    abstract val familyName: String
    abstract fun callAbstractFun()
    fun display():String{
        return "Family Name : $familyName"
    }
}