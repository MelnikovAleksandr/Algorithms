package longest_palindromic_substring

/**
 * Given a string s, return the longest palindromic substring in s.
 */

fun longestPalindrome(s: String): String {
    val length = s.length
    val table = Array(length) { BooleanArray(length) }
    var maxLen = 1
    var start = 0
    var end = 0

    // All substrings of length 1 are palindromes
    for (i in 0 until length) {
        table[i][i] = true
    }

    // Check for substrings of length 2
    for (i in 0 until length - 1) {
        if (s[i] == s[i + 1]) {
            table[i][i + 1] = true
            maxLen = 2
            start = i
            end = i + 1
        }
    }

    // Check for substrings of length 3 or more
    for (len in 3..length) {
        for (i in 0 until length - len + 1) {
            val j = i + len - 1
            if (s[i] == s[j] && table[i + 1][j - 1]) {
                table[i][j] = true
                if (len > maxLen) {
                    maxLen = len
                    start = i
                    end = j
                }
            }
        }
    }

    return s.substring(start, end + 1)
}
