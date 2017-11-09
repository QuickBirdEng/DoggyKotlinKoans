package com.quickbirdstudios.kotlinbasics.exercises

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class ControlFlow {

    @Test
    fun testOwnerNameIsCorrect() {
        assertEquals("Hans", findDogOwnerName(Dog("Bruno")))
        assertEquals("Peter", findDogOwnerName(Dog("Ignatz")))
        assertEquals("Susi", findDogOwnerName(Dog("Lucy")))
        assertEquals(null, findDogOwnerName(Dog("Balu")))
    }

    //  TODO TASK 1 using the "when" operator, return:
    //  TODO -> the dog owner name "Hans" if dog name is "Bruno"
    //  TODO -> the dog owner name "Ignatz" if dog name is "Peter"
    //  TODO -> the dog owner name "Lucy" if dog name is "Susi"
    //  TODO -> NULL otherwise
    fun findDogOwnerName(dog: Dog): String? {
        throw NotImplementedError("Please implement the task :-)")
    }

    //  TODO TASK 2 using the "when" operator, return:
    //  TODO -> "Baby Dog" if dog is 0 or 1 year old
    //  TODO -> "Normal Dog" if dog is 2 to 8 years old
    //  TODO -> "Old Dog" otherwise
    fun ageToString(dog: Dog): String? {
        throw NotImplementedError("Please implement the task :-)")
    }
}