package com.quickbirdstudios.kotlinbasics.exercises

import android.graphics.Rect
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */

class Optionals {


    private fun letDogBark(dog: Dog?) {
//      TODO TASK 1 call the function "bark" on the dog

    }

    private fun getDogIntroduction(dog: Dog?): String {
//      TODO TASK 2 return a string with the dog name where he introduces himself using his "name". If the dog is null, use "NoNameDog" as the dog "name"
        throw NotImplementedError("Please implement the task :-)")
    }

    //  TODO TASK 3 return the "name" of the dog IF it is a dog. if it is not a dog, return "type unknown"
    private fun getNameOf(any: Any): String {
        throw NotImplementedError("Please implement the task :-)")
    }

    private fun getNameOfSimplified(any: Any): String {
        return (any as? Dog)?.name ?: "type unknown"
    }

    @Test
    fun testKotlinMakesDogAccessSafer() {
        letDogBark(null)
    }

    @Test
    fun testDogGetsIntroducedCorrectlyWhenNull() {
        assertEquals("My name is NoNameDog", getDogIntroduction(null))
    }

    @Test
    fun testDogGetsIntroducedCorrectlyWhenNotNull() {
        assertEquals("My name is Bruno", getDogIntroduction(Dog("Bruno")))
    }

    @Test
    fun testSafeCasts() {
        assertEquals("Bruno", getNameOf(Dog("Bruno", "Labrador", 5)))
        assertEquals("type unknown", getNameOf(Rect(1, 2, 3, 4)))
    }
}
