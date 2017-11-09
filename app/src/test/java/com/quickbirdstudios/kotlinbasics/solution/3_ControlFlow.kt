package com.quickbirdstudios.kotlinbasics.solution

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

    //  TODO TASK 2 using the "when" operator on the "dog.age", return:
    //  TODO -> "Baby Dog" if dog is 0 or 1 year old
    //  TODO -> "Normal Dog" if dog is 2 to 8 years old (
    //  HINT: use the range oprator "x..y" and "in" keyword
    //  TODO -> "Old Dog" otherwise
    fun ageToString(dog: Dog): String {
        throw NotImplementedError("Please implement the task :-)")
    }

    @Test
    fun testOwnerNameIsCorrect() {
        assertEquals("Baby Dog", ageToString(Dog("Bruno",age = 1)))
        assertEquals("Normal Dog", ageToString(Dog("Ignatz",age = 5)))
        assertEquals("Old Dog", ageToString(Dog("Balu",age = 13)))
    }

    @Test
    fun testAgeDescriptionIsCorrect() {
        assertEquals("Hans", findDogOwnerName(Dog("Bruno")))
        assertEquals("Peter", findDogOwnerName(Dog("Ignatz")))
        assertEquals(null, findDogOwnerName(Dog("Balu")))
    }
}