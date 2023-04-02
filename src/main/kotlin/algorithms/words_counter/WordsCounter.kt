package algorithms.words_counter

/**
 * Write a function that counts the number of words in a given string.
 * A word is any sequence of characters separated by spaces.
 */

fun wordsCounter(str: String): Int {
    return str.split(" ").count()
}