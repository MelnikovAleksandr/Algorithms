package sorting

import org.junit.Test
import org.junit.Assert.*

class ShellSortKtTest {

    @Test
    fun testShellSort() {
        val arr1 = intArrayOf(5, 4, 3, 2, 1)
        shellSort(arr1)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), arr1)

        val arr2 = intArrayOf(1, 3, 2, 5, 4)
        shellSort(arr2)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), arr2)

        val arr3 = intArrayOf(1)
        shellSort(arr3)
        assertArrayEquals(intArrayOf(1), arr3)

        val arr4 = intArrayOf()
        shellSort(arr4)
        assertArrayEquals(intArrayOf(), arr4)
    }
}
