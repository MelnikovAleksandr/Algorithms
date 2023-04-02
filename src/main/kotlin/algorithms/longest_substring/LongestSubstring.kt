package algorithms.longest_substring

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */

fun lengthOfLongestSubstring(s: String): Int {

    var maxLen = 0
    var start = 0
    val charSet = mutableSetOf<Char>()
    for (end in s.indices) {
        while (charSet.contains(s[end])) {
            charSet.remove(s[start])
            start++
        }
        charSet.add(s[end])
        maxLen = maxOf(maxLen, end-start+1)
    }
    return maxLen
}
