package sorting

import org.junit.Assert.assertEquals
import org.junit.Test

class Partition01Test {

    @Test
    fun testPartition01() {
        val arr1 = intArrayOf(0, 1, 0, 1, 1)
        val count1 = partition01(arr1, arr1.size)
        assertEquals(1, count1)
        assertEquals(intArrayOf(0, 0, 1, 1, 1).toList(), arr1.toList())

        val arr2 = intArrayOf(1, 1, 1, 0, 0)
        val count2 = partition01(arr2, arr2.size)
        assertEquals(2, count2)
        assertEquals(intArrayOf(0, 0, 1, 1, 1).toList(), arr2.toList())

        val arr5 = intArrayOf(0, 1, 1, 1, 1)
        val count5 = partition01(arr5, arr5.size)
        assertEquals(0, count5)
        assertEquals(intArrayOf(0, 1, 1, 1, 1).toList(), arr5.toList())
    }
}

