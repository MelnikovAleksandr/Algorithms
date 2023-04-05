package algorithms.reverse_integer

/**
 * Reverses the digits of a signed 32-bit integer.
 * If the reversed integer goes outside the signed 32-bit integer range, returns 0.
 * @param x the integer to reverse
 * @return the reversed integer or 0 if the reversed integer is outside the range
 */

fun reverse(x: Int): Int {
    var result = 0
    var num = x // copy of input integer

    // loop through each digit of the input integer
    while (num != 0) {
        val digit = num % 10 // get the rightmost digit
        num /= 10 // remove the rightmost digit from the number

        // check if adding the digit to the reversed integer would cause an overflow
        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) {
            return 0 // return 0 if overflow
        }
        if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && digit < -8)) {
            return 0 // return 0 if overflow
        }

        // add the digit to the reversed integer
        result = result * 10 + digit
    }

    return result
}

fun main() {
    // test cases
    val testCases = arrayOf(
        123 to 321,
        -123 to -321,
        120 to 21,
        0 to 0,
        Int.MAX_VALUE to 0,
        Int.MIN_VALUE to 0
    )

    // run tests and print results
    for ((x, expected) in testCases) {
        val result = reverse(x)
        val status = if (result == expected) "PASS" else "FAIL"
        println("$x reversed is $result ($status)")
    }
}
