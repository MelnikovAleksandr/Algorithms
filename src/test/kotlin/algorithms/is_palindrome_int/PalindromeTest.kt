package algorithms.is_palindrome_int

import org.junit.Assert.*
import org.junit.Test

class PalindromeTest {
    @Test
    fun testPositivePalindrome() {
        assertTrue(isPalindrome(121))
    }

    @Test
    fun testNegativePalindrome() {
        assertFalse(isPalindrome(-121))
    }

    @Test
    fun testNonPalindrome() {
        assertFalse(isPalindrome(123))
    }
}