package algorithms.string_to_integer_atoi

/**
 * Function that converts a string to a 32-bit signed integer.
 * If the string cannot be converted to an integer, 0 is returned.
 * If the resulting integer is out of the range of a 32-bit signed integer,
 * it will be clamped to the nearest possible value.
 *
 * @param s the string to be converted to an integer.
 * @return a 32-bit signed integer obtained from the string.
 */


fun myAtoi(s: String): Int {
    var i = 0
    var sign = 1
    var result = 0

    while (i < s.length && s[i] == ' ') {
        i++
    }

    if (i < s.length && (s[i] == '-' || s[i] == '+')) {
        sign = if (s[i] == '-') -1 else 1
        i++
    }

    while (i < s.length && s[i].isDigit()) {
        val digit = s[i].code - '0'.code
        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) {
            return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
        }
        result = result * 10 + digit
        i++
    }

    return sign * result
}

