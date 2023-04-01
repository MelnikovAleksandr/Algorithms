package sorts

/**
 * An array of integers is given.
 * Write a function that sorts this array in ascending order.
 */

fun bubbleSort(array: IntArray): IntArray {
    for (i in array.indices) {
        for (j in i + 1 until array.size) {
            if (array[j] < array[i]) {
                val tmp = array[i]
                array[i] = array[j]
                array[j] = tmp
            }
        }
    }
    return array
}