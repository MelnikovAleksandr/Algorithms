package common_divisor

import org.junit.Assert.*
import org.junit.Test

class CommonDivisorTest {

    @Test
    fun finder_test() {
        val commonDivisor = CommonDivisor()
        val result = commonDivisor.findDivisor(29, 3)

        assertEquals(result, 1)
    }
}