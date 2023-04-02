package sorting

import org.junit.Assert.*
import org.junit.Test

class InsertionSortTest {

    @Test
    fun testInsertionSort() {
        val array = intArrayOf(5, 1, 4, 2, 8)
        insertionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 4, 5, 8), array)
    }

    @Test
    fun testInsertionSortEmptyArray() {
        val array = intArrayOf()
        insertionSort(array)
        assertArrayEquals(intArrayOf(), array)
    }

    @Test
    fun testInsertionSortAlreadySortedArray() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        insertionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }

    @Test
    fun testInsertionSortReverseSortedArray() {
        val array = intArrayOf(5, 4, 3, 2, 1)
        insertionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }
}
