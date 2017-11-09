package com.quickbirdstudios.kotlinbasics.exercises

import android.graphics.Rect
import com.quickbirdstudios.kotlinbasics.Dog
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */

class Optionals {


    private fun letDogBark(dog: Dog?) {
//      TODO TASK 1 call the function "bark" on the dog using the Safe Call Operator

    }

    private fun getDogName(dog: Dog?): String {
//      TODO TASK 2 return the DOG NAME if the dog is NOT null (HINT: use Elvis operator "?:" )
//      TODO TASK 2 return "No dog found" if the dog IS null
        throw NotImplementedError("Please implement the task :-)")
    }

    //  TODO TASK 3 return the DOG NAME if it IS a dog. (HINT: use "as?"-cast or "is" check)
    //  TODO TASK 3 if it is NOT a dog, return "type unknown"
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
        assertEquals("No dog found", getDogName(null))
    }

    @Test
    fun testDogGetsIntroducedCorrectlyWhenNotNull() {
        assertEquals("My name is Bruno", getDogName(Dog("Bruno")))
    }

    @Test
    fun testSafeCasts() {
        assertEquals("Bruno", getNameOf(Dog("Bruno", "Labrador", 5)))
        assertEquals("type unknown", getNameOf(Rect(1, 2, 3, 4)))
    }
}
