package algorithms.sum_of_digits

import algorithms.sum_of_digits.sumOfDigits
import org.junit.Assert.*
import org.junit.Test

class SumOfDigitsTest {

    @Test
    fun test_sum() {
        val result1 = sumOfDigits(1234)
        val result2 = sumOfDigits(9876)
        assertEquals(result1, 10)
        assertEquals(result2, 30)
    }
}