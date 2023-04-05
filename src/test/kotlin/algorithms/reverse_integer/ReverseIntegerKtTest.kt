package algorithms.reverse_integer

import org.junit.Assert.*
import org.junit.Test

class ReverseIntegerKtTest {

    @Test
    fun `test reverse integer`() {

        assertEquals(321, reverse(123))
        assertEquals(-321, reverse(-123))
        assertEquals(21, reverse(120))
        assertEquals(0, reverse(0))
        assertEquals(0, reverse(2147483647))
        assertEquals(0, reverse(-2147483648))
    }
}