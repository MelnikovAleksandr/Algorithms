package sorting

/**
 * Sorts the input array of integers using Counting Sort algorithm.
 * Counting Sort is an efficient sorting algorithm for small-range positive integers. It operates by counting the
 * number of occurrences of each element and using arithmetic to determine their position in the output sequence.
 * The input array must contain only non-negative integers.
 *
 * Data structure Array
 * Worst-Case performance O(n+k)
 * Average-Case performance O(n+k)
 * Worst-Case Space Complexity O(k)
 * k - Number of distinct elements
 * n - Total number of elements in the array.
 *
 * @param arr the input array of integers to be sorted
 * @param range the range of integers in the input array, must be non-negative and greater than or equal to the maximum value in the array
 * @return the input array sorted in ascending order
 * @throws IllegalArgumentException if the input array is empty or contains negative integers or the specified range is negative
 */


fun countingSort(arr: IntArray, range: Int) {
    if (arr.isEmpty()) return

    val count = IntArray(range + 1)

    for (i in arr.indices) {
        count[arr[i]]++
    }

    var j = 0
    for (i in 0..range) {
        while (count[i] > 0) {
            arr[j++] = i
            count[i]--
        }
    }
}
