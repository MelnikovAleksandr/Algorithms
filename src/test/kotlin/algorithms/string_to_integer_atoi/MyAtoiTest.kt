package algorithms.string_to_integer_atoi

import org.junit.Assert.*
import org.junit.Test

class MyAtoiTest {

    @Test
    fun testEmptyString() {
        val result = myAtoi("")
        assertEquals(0, result)
    }

    @Test
    fun testOnlyWhitespace() {
        val result = myAtoi("     ")
        assertEquals(0, result)
    }

    @Test
    fun testPositiveNumber() {
        val result = myAtoi("42")
        assertEquals(42, result)
    }

    @Test
    fun testNegativeNumber() {
        val result = myAtoi("-42")
        assertEquals(-42, result)
    }

    @Test
    fun testNumberWithLeadingWhitespace() {
        val result = myAtoi("   42")
        assertEquals(42, result)
    }

    @Test
    fun testNumberWithTrailingWhitespace() {
        val result = myAtoi("42   ")
        assertEquals(42, result)
    }

    @Test
    fun testNumberWithLeadingAndTrailingWhitespace() {
        val result = myAtoi("   42   ")
        assertEquals(42, result)
    }

    @Test
    fun testNumberWithLeadingPlus() {
        val result = myAtoi("+42")
        assertEquals(42, result)
    }

    @Test
    fun testNumberWithLeadingMinus() {
        val result = myAtoi("-42")
        assertEquals(-42, result)
    }

    @Test
    fun testNumberWithNonDigitCharacter() {
        val result = myAtoi("4193 with words")
        assertEquals(4193, result)
    }

    @Test
    fun testNumberOutOfRange() {
        val result = myAtoi("2147483648")
        assertEquals(2147483647, result)
    }
}
