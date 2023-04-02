package sorting

import org.junit.Assert.*
import org.junit.Test

class BubbleSortTest {

    @Test
    fun testBubbleSort() {
        val array = intArrayOf(5, 1, 4, 2, 8)
        bubbleSort(array)
        assertArrayEquals(intArrayOf(1, 2, 4, 5, 8), array)
    }

    @Test
    fun testBubbleSortEmptyArray() {
        val array = intArrayOf()
        bubbleSort(array)
        assertArrayEquals(intArrayOf(), array)
    }

    @Test
    fun testBubbleSortAlreadySortedArray() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        bubbleSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }

    @Test
    fun testBubbleSortReverseSortedArray() {
        val array = intArrayOf(5, 4, 3, 2, 1)
        bubbleSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }

    @Test
    fun testBubbleSort2() {
        val array = intArrayOf(5, 1, 4, 2, 8)
        bubbleSort2(array)
        assertArrayEquals(intArrayOf(1, 2, 4, 5, 8), array)
    }

    @Test
    fun testBubbleSortEmptyArray2() {
        val array = intArrayOf()
        bubbleSort2(array)
        assertArrayEquals(intArrayOf(), array)
    }

    @Test
    fun testBubbleSortAlreadySortedArray2() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        bubbleSort2(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }

    @Test
    fun testBubbleSortReverseSortedArray2() {
        val array = intArrayOf(5, 4, 3, 2, 1)
        bubbleSort2(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), array)
    }
}
