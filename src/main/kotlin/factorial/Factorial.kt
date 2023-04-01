package factorial

/**
 * Write a function that calculates the factorial of a given number.
 * The factorial of the number n is denoted by n!
 * and is equal to the product of all natural numbers from 1 to n inclusive.
 */

fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}
