package longest_palindromic_substring

import org.junit.Assert.*
import org.junit.Test

class LongestPalindromicSubstringKtTest {

    @Test
    fun longest_palindrome_test() {
        val str = "TENET OPERA"
        val result = longestPalindrome(str)
        assertEquals(result, "TENET")
    }
    @Test
    fun longest_palindrome_test2() {
        val str = "TENET OPERA"
        val result = longestPalindrome2(str)
        assertEquals(result, "TENET")
    }
}