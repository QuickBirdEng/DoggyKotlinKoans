package com.quickbirdstudios.kotlinbasics.exercises.solution

import com.quickbirdstudios.kotlinbasics.Dog
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by Malte Bucksch on 06/11/2017.
 */
class Lambdas {
    private val dogs = listOf(Dog("Bruno", age = 4), Dog("Daisy", age = 12), Dog("Rex", age = 7))

    // TODO TASK 1 find and return a list of the names of all dogs using "map"
    private fun findDogNames(dogs: List<Dog>) = dogs.map { it.name }


    // TODO TASK 2 find and return a list of all dogs whose "age" is older than 5 years using "filter"
    private fun findOldDogs(dogs: List<Dog>) = dogs.filter { it.age > 5 }

    // TODO TASK 3 COMBINE FILTER AND MAP: find and return a list of the NAMES of all dogs that are OLDER THAN 5
    private fun findNamesOfOldDogs(dogs: List<Dog>) = dogs.filter { it.age > 5 }.map { it.name }

    @Test
    fun testDogNamesUsingMap() {
        val names = findDogNames(dogs)

        assertEquals(listOf("Bruno", "Daisy", "Rex"), names)
    }

    @Test
    fun testOldDogsUsingFilter() {
        val oldDogs = findOldDogs(dogs)

        for (dog in oldDogs) {
            assertTrue(dog.age > 5)
        }
    }

    @Test
    fun testFindNamesOfOldDogs() {
        val oldDogNames = findNamesOfOldDogs(dogs)

        assertEquals(listOf("Daisy", "Rex"), oldDogNames)
    }
}