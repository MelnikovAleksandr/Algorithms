package palindrome

/**
 * A string is given. Determine if it is a palindrome
 */

class Palindrome {

    fun isPalindrome(str: String): Boolean {
        val length = str.length
        for (i in 0 until length / 2) {
            if (str[i] != str[length - i - 1]) {
                return false
            }
        }
        return true
    }
}