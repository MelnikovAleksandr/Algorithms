package algorithms.is_palindrome_int

/**
 * This function returns true if the given integer is a palindrome,
 * and false otherwise. A palindrome is a number that reads the same
 * backward as forward, for example, 121 or 34543.
 *
 * @param x the integer to check for palindrome
 * @return true if the given integer is a palindrome, false otherwise
 */

fun isPalindrome(x: Int): Boolean {

    if (x < 0) return false

    var num = x
    var rev = 0

    while (num > 0) {
        rev = rev * 10 + num % 10
        num /= 10
    }
    return rev == x
}