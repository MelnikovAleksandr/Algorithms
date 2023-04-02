package algorithms.factorial

import algorithms.factorial.factorial
import org.junit.Assert.*
import org.junit.Test

class FactorialKtTest {

    @Test
    fun test_factorial() {
        val result = factorial(7)
        assertEquals(result, 5040)
    }

}