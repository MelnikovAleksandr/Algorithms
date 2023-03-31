package sum_of_digits

import org.junit.Assert.*
import org.junit.Test

class SumOfDigitsTest {

    @Test
    fun test_sum() {
        val sum = SumOfDigits()
        val result1 = sum.sumOfDigits(1234)
        val result2 = sum.sumOfDigits(9876)
        assertEquals(result1, 10)
        assertEquals(result2, 30)
    }
}