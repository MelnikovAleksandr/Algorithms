package algorithms.longest_palindromic_substring

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

fun longestPalindrome2(s: String): String {
    if (s.length < 2) return s
    val n = s.length
    var start = 0
    var maxLength = 1
    var i = 0
    while (i < n) {
        if (n - i <= maxLength / 2) break
        var j = i
        var k = i
        while (k < n - 1 && s[k + 1] == s[k]) k++
        i = k + 1
        while (k < n - 1 && j > 0 && s[k + 1] == s[j - 1]) {
            k++
            j--
        }
        val newLength = k - j + 1
        if (newLength > maxLength) {
            maxLength = newLength
            start = j
        }
    }
    return s.substring(start, start + maxLength)
}


