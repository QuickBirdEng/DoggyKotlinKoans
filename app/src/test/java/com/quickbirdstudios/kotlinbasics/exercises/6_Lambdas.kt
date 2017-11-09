package com.quickbirdstudios.kotlinbasics.exercises

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by Malte Bucksch on 06/11/2017.
 */
class Lambdas {
    private val dogs = listOf(Dog("Bruno", age = 4), Dog("Daisy", age = 12), Dog("Rex", age = 7))

    // TODO TASK 1 find and return a list of the names of all dogs
    private fun findDogNames(): List<String> {
        throw NotImplementedError("Please implement the task :-)")
    }

    // TODO TASK 2 find and return a list of all dogs that are older than 5 years
    private fun findOldDogs(): List<Dog> {
        throw NotImplementedError("Please implement the task :-)")
    }

    // TODO TASK 3 COMBINE BOTH: find and return a list of the NAMES of all dogs that are older than 5
    private fun findNamesOfOldDogs(): List<String> {
        throw NotImplementedError("Please implement the task :-)")
    }

    @Test
    fun testDogNamesUsingMap() {
        val names = findDogNames()

        assertEquals(listOf("Bruno", "Daisy", "Rex"), names)
    }

    @Test
    fun testOldDogsUsingFilter() {
        val oldDogs = findOldDogs()

        for (dog in oldDogs) {
            assertTrue(dog.age > 5)
        }
    }

    @Test
    fun testFindNamesOfOldDogs() {
        val oldDogNames = findNamesOfOldDogs()

        assertEquals(listOf("Daisy", "Rex"), oldDogNames)
    }
}