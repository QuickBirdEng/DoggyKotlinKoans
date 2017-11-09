package com.quickbirdstudios.kotlinbasics.exercises

import org.junit.Test


/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class VariablesAndFunctions {
    @Test
    fun testMyNewDogClass() {
        // TODO TASK 4 create a dog, let him "introduce", and let him "bark" 3 times
        val animals = listOf<Any>()
        animals.filter({ animal ->
            animal is Dog
        })

        throw NotImplementedError("Please implement the task :-)")
    }

    // TODO TASK 1 add two properties "name" and "type"(read-only)
    // TODO TASK 2 add a function "bark" with "times" argument which prints "wuff" multiple times
    // HINT: Use the "repeat" function ("xxx".repeat(3))
    // TODO TAKS 3 add a function "introduce" which prints "Hey my name is <NAME>"
    private class Dog {


    }
}
