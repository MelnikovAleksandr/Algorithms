package median_of_two_sort_arrays

import org.junit.Assert.*
import org.junit.Test

class MedianOfTwoSortArrayKtTest {

    @Test
    fun median_test() {
        val array1 = intArrayOf(1,3,6,9)
        val array2 = intArrayOf(-2,0,9,11,71)
        val result = findMedianSortedArrays(array2, array1)
        assertEquals(result, 6.0, 0.0)
    }

}