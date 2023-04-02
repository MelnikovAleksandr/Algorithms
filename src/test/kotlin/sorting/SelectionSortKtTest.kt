package sorting

import org.junit.Assert.*
import org.junit.Test

class SelectionSortTest {

    @Test
    fun testSelectionSort() {
        val array = intArrayOf(5, 1, 4, 2, 8)
        selectionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 4, 5, 8), array)
    }

    @Test
    fun testSelectionSortEmptyArray() {
        val array = intArrayOf()
        selectionSort(array)
        assertArrayEquals(intArrayOf(), array)
    }

    @Test
    fun testSelectionSortAlreadySortedArray() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        selectionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }

    @Test
    fun testSelectionSortReverseSortedArray() {
        val array = intArrayOf(5, 4, 3, 2, 1)
        selectionSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }
}
