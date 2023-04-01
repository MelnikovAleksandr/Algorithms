package words_counter

import org.junit.Assert.*
import org.junit.Test

class WordsCounterKtTest {

    @Test
    fun wordsCounter() {
        val text = "Write a function that counts the number of words in a given string."
        val result = wordsCounter(text)
        assertEquals(result, 13)
    }
}