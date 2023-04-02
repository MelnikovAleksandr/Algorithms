package sorting

/**
 * Sorts an array of integers using insertion sort algorithm.
 *
 *
 * Worst-case time complexity O(n^2).
 * Best-Case time complexity O(n).
 * Average-Case time complexity O(n^2).
 * Space Complexity O(1).
 * Stable sorting Yes.
 *
 * @param array the array to be sorted
 */

fun insertionSort(array: IntArray) {
    for (i in 1 until array.size) {
        val key = array[i]
        var j = i
        while (j > 0 && array[j - 1] > key) {
            array[j] = array[j - 1]
            j--
        }
        array[j] = key
    }
}