package com.quickbirdstudios.kotlinbasics.exercises
import com.quickbirdstudios.kotlinbasics.barkify
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test


/**
 * Created by Malte Bucksch on 06/11/2017.
 */
class Extensions {
    // TODO TASK 1 create extension function "allCaps" for String - BEGIN




    // TODO TAKS 1 - END

    //    TODO TASK 2 apply your extension to the "text"
    private fun applyAllCapsExtension(text: String) {
        throw NotImplementedError("Please implement the task :-)")
    }

    @Test
    fun testAllCapsDogLanguage() {
//        TODO TASK 3 "barkfiy" and "allCaps this string
        val allCapsDogLanguage = "Ich habe ganz viel Hunger"

        assertEquals("WUFF WUFF WUFF WUFF WUFF",allCapsDogLanguage)
    }

    fun String.allCapsSimplified(): String {
        return this.map { it.toUpperCase() }.joinToString()
    }

    @Test
    fun translateToDogLanguage() {
        print("Wie heißt du?".barkify())

        fail()
    }

    @Test
    fun testStringAllCaps() {
        assertEquals("DOG", applyAllCapsExtension("dog"))
        assertEquals("CAT", applyAllCapsExtension("cat"))
        assertEquals("DOG", applyAllCapsExtension("DOG"))
    }
}