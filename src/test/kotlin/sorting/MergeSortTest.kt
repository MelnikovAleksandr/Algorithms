package sorting

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MergeSortTest {

    @Test
    fun testMergeSort() {
        val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
        val sortedArray = mergeSort(array)
        assertArrayEquals(intArrayOf(3, 9, 10, 27, 38, 43, 82), sortedArray)
    }

    @Test
    fun testMergeSortWithEmptyArray() {
        val array = intArrayOf()
        val sortedArray = mergeSort(array)
        assertArrayEquals(intArrayOf(), sortedArray)
    }

    @Test
    fun testMergeSortWithSingleElementArray() {
        val array = intArrayOf(42)
        val sortedArray = mergeSort(array)
        assertArrayEquals(intArrayOf(42), sortedArray)
    }

    @Test
    fun testMergeSortReverseSortedArray() {
        val array = intArrayOf(82, 43, 38, 27, 10, 9, 3)
        bubbleSort(array)
        assertArrayEquals(intArrayOf(3, 9, 10, 27, 38, 43, 82), array)
    }
}
