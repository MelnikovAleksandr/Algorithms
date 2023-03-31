package palindrome

import org.junit.Assert.*
import org.junit.Test

class PalindromeTest {

    @Test
    fun palindrome_check() {
        val palindrome = Palindrome()
        val test1 = "TENET"
        val test2 = "OPERA"
        val result1 = palindrome.isPalindrome(test1)
        val result2 = palindrome.isPalindrome(test2)

        assertEquals(result1, true)
        assertEquals(result2, false)

    }
}