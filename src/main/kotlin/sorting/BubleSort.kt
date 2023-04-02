package sorting

/**
 * Sorts an array of integers using bubble sort algorithm.
 *
 * Worst-case performance O(n^2).
 * Average-Case performance O(n^2).
 * Space Complexity O(1).
 * Modified: When the array is nearly sorted O(n).
 * Stable Sorting - Yes.
 *
 * @param array the array to be sorted
 */

fun bubbleSort(array: IntArray) {
    for (i in array.indices) {
        for (j in 1 until array.size - i) {
            if (array[j - 1] > array[j]) {
                val temp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = temp
            }
        }
    }
}

/**
 * Sorts an array of integers using bubble sort algorithm.
 * @param arr the array to be sorted
 *
 * Modified: When the array is nearly sorted.
 */


fun bubbleSort2(arr: IntArray) {
    val size = arr.size
    var swapped = 1
    var i = 0
    while (i < size - 1 && swapped == 1) {
        swapped = 0
        var j = 0
        while (j < size - i - 1) {
            if (arr[j] >= arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = 1
            }
            j++
        }
        i++
    }
}
