package com.quickbirdstudios.kotlinbasics.exercises

import com.quickbirdstudios.kotlinbasics.Dog
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class ControlFlow {
    //  TODO TASK 1 use the when operator on the "dog.name":
    //  TODO -> if the name is "Bruno", return the owner name "Hans"
    //  TODO -> if the name is "Ignatz", return the owner name "Peter"
    //  TODO -> otherwise return null
    fun findDogOwnerName(dog: Dog): String? {
        throw NotImplementedError("Please implement the task :-)")
    }

    //  TODO TASK 2 using the "when" operator, return:
    //  TODO -> "Baby Dog" if dog is 0 or 1 year old
    //  TODO -> "Normal Dog" if dog is 2 to 8 years old
    //  TODO -> "Old Dog" otherwise
    //  HINT: use the range oprator "x..y"
    fun ageToString(dog: Dog): String? {
        throw NotImplementedError("Please implement the task :-)")
    }

    @Test
    fun testOwnerNameIsCorrect() {
        assertEquals("Hans", findDogOwnerName(Dog("Bruno")))
        assertEquals("Peter", findDogOwnerName(Dog("Ignatz")))
        assertEquals(null, findDogOwnerName(Dog("Balu")))
    }
}