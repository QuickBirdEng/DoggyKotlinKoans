package com.quickbirdstudios.kotlinbasics


/**
 * Created by Malte Bucksch on 09/11/2017.
 */
class Dog(var name: String, val type: String = "Labrador", var age: Int = 5) {
    fun bark(times: Int = 3) {
        println("wufff".repeat(times))
    }

    fun sayHello(): String {
        return "Hey my name is $name"
    }
}