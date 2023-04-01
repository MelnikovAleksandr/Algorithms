package common_divisor

/**
 * Two natural numbers are given. Find their least common divisor.
 */

fun findDivisor(a: Int, b: Int): Int {
    var x = a
    var y = b

    while (y != 0) {
        val tmp = y
        y = x % y
        x = tmp
    }
    return x
}
