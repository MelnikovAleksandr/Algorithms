package palindrome

import org.junit.Assert.*
import org.junit.Test

class PalindromeTest {

    @Test
    fun palindrome_check() {
        val test1 = "TENET"
        val test2 = "OPERA"
        val result1 = isPalindrome(test1)
        val result2 = isPalindrome(test2)

        assertEquals(result1, true)
        assertEquals(result2, false)

    }

    @Test
    fun test_palindrome_2() {
        val test1 = "TENET"
        val test2 = "OPERA"
        val result1 = isPalindrome2(test1)
        val result2 = isPalindrome2(test2)

        assertEquals(result1, true)
        assertEquals(result2, false)
    }
}