package sorts

import org.junit.Test
import org.junit.jupiter.api.Assertions
import kotlin.random.Random

class BubbleSortKtTest {

    private fun randomArray(size: Int) =
        List(size) { Random.nextInt(100) }.toIntArray()

    @Test
    fun bubble_sort_test() {
        val actual = randomArray(500)
        val expected = actual.sorted()
        val result = bubbleSort(actual)
        Assertions.assertEquals(expected, result.toList())
    }
}