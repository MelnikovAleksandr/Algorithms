package longest_substring

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
