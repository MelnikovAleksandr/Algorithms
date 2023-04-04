package sorting

import org.junit.Assert.*
import org.junit.Test

class CountingSortKtTest {

    @Test
    fun testCountingSortEmptyArray() {
        val arr = intArrayOf()
        countingSort(arr, 10)
        assertArrayEquals(intArrayOf(), arr)
    }

    @Test
    fun testCountingSortAlreadySorted() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        countingSort(arr, 5)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun testCountingSortReverseOrder() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        countingSort(arr, 5)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun testCountingSortRandomOrder() {
        val arr = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        countingSort(arr, 9)
        assertArrayEquals(intArrayOf(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9), arr)
    }

    @Test
    fun testCountingSortDuplicateValues() {
        val arr = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        countingSort(arr, 9)
        assertArrayEquals(intArrayOf(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9), arr)
    }
}
