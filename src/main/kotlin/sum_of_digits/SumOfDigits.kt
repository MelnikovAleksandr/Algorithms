package sum_of_digits

/**
 * Given a natural number. Find the sum of its digits.
 */

class SumOfDigits {
    fun sumOfDigits(n: Int): Int {
        var sum = 0
        var num = n
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        return sum
    }
}