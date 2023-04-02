package sorting

/**
 * Sorts an array of integers using selection sort algorithm.
 *
 * Worst-Case time complexity O(n^2).
 * Best-Case time complexity O(n^2).
 * Average-Case time complexity O(n^2).
 * Space Complexity O(1).
 * Stable Sorting No.
 *
 * @param array the array to be sorted.
 */

fun selectionSort(array: IntArray) {
    val size = array.size
    for (i in 0 until size - 1) {
        var min = i
        for (j in i + 1 until size) {
            if (array[j] < array[min]) {
                min = j
            }
        }
        val temp = array[i]
        array[i] = array[min]
        array[min] = temp
    }
}