package palindrome

/**
 * A string is given. Determine if it is a palindrome
 */

fun isPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}

fun isPalindrome2(str: String): Boolean {
    val reversed = str.reversed()
    return str == reversed
}
