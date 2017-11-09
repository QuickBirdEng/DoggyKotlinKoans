package com.quickbirdstudios.kotlinbasics.solution

import org.junit.Test


/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class SimpleDogClassTests {
    // TODO TASK 1 add two properties "name" and "type"(read-only)
    // TODO TASK 2 add a function "bark" with a "times"(Int) argument -> which prints "wuff" multiple times
    // HINT: Use the "repeat" function ("xxx".repeat(3))
    // HINT: Use "println" function to print sth (println("test"))
    private class Dog(val name: String, val type: String) {
        fun bark(times: Int = 1) {
            println("Wuff".repeat(n = times))
        }
    }

    @Test
    fun testMyNewDogClass() {
        // TODO TASK 4: 1. create a dog instance named "Bruno" with type "Labrador"
        // TODO TASK 4: 2. let him "bark" 3 times
        val bruno = Dog("Bruno", "Labrador")
        bruno.bark(3)
    }
}
