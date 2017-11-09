package com.quickbirdstudios.kotlinbasics.exercises
import com.quickbirdstudios.kotlinbasics.barkify
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test


/**
 * Created by Malte Bucksch on 06/11/2017.
 */
class Extensions {
    // TODO TASK 1 create extension function "scream" for String
    // TODO TASK 1 turn all letters UPPERCASE and add "!!!" at the end
    // HINT use "test".toUpperCase() function on the string
    // TODO TASK 1 YOUR CODE BEGIN



    // TODO TAKS 1 YOUR CODE END

    //    TODO TASK 2 apply your extension to the "text"
    private fun applyAllCapsExtension(text: String) {
        throw NotImplementedError("Please implement the task :-)")
    }

    @Test
    fun testAllCapsDogLanguage() {
//        TODO TASK 3 use the both extenstions "barkfiy" and "scream" on this string
        val allCapsDogLanguage = "Ich habe ganz viel Hunger" // TODO <---- add here

        assertEquals("WUFF WUFF WUFF WUFF WUFF!!!",allCapsDogLanguage)
    }

    @Test
    fun testStringScream() {
        assertEquals("DOG!!!", applyAllCapsExtension("dog"))
        assertEquals("CAT!!!", applyAllCapsExtension("cat"))
        assertEquals("DOG!!!", applyAllCapsExtension("DOG"))
    }
}