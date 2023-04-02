package algorithms.longest_substring

import algorithms.longest_substring.lengthOfLongestSubstring
import org.junit.Assert.*
import org.junit.Test

class LongestSubstringKtTest {

    @Test
    fun longest_substring_test() {
        val s = "abcabcbb"
        val result = lengthOfLongestSubstring(s)
        assertEquals(result, 3)
    }
}
