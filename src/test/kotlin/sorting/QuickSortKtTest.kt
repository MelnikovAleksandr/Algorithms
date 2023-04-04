package sorting

import org.junit.Assert.*
import org.junit.Test

class QuickSortKtTest {

    @Test
    fun testEmptyArray() {
        val arr = intArrayOf()
        quickSort(arr)
        assertArrayEquals(intArrayOf(), arr)
    }

    @Test
    fun testSingleElementArray() {
        val arr = intArrayOf(42)
        quickSort(arr)
        assertArrayEquals(intArrayOf(42), arr)
    }

    @Test
    fun testAscendingOrderArray() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        quickSort(arr)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), arr)
    }

    @Test
    fun testDescendingOrderArray() {
        val arr = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
        quickSort(arr)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), arr)
    }

    @Test
    fun testRandomOrderArray() {
        val arr = intArrayOf(5, 3, 9, 1, 10, 8, 4, 2, 7, 6)
        quickSort(arr)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }

}