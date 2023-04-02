package algorithms.common_divisor

import algorithms.common_divisor.findDivisor
import org.junit.Assert.*
import org.junit.Test

class CommonDivisorTest {

    @Test
    fun finder_test() {
        val result = findDivisor(29, 3)

        assertEquals(result, 1)
    }
}