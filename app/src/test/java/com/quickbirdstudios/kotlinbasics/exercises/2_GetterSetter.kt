package com.quickbirdstudios.kotlinbasics.exercises

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class DogGetterSetter {
    private val dog = Dog("bruno", "Labrador");

    @Test
    fun testDogNameIsCapitalized() {
        assertEquals("Bruno", dog.name)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testEmptyDogNameNotAllowed() {
        dog.name = ""
    }
}

class Dog(name: String, val type: String = "Labrador", var age: Int = 5) {
//  TODO TASK 1 create getter for name which capitalizes every name
//  TODO TASK 2 create setter for name which throws an exception when name is empty
    var name = name

    fun bark(times: Int = 3) {
        println("wufff".repeat(times))
    }

    fun sayHello(): String {
        return "Hey my name is $name"
    }
}