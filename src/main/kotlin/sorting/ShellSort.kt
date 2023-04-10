package sorting

/**
 *Sorts an array of integers using Shell sort algorithm.
 *
 * Data structure Array
 * Best-Case performance O(n.log(n))
 * Worst-Case performance O(n^2)
 * Average-Case performance O(n.log(n))
 * Space Complexity O(1)
 *
 * @param arr the array to be sorted
 */

fun shellSort(arr: IntArray) {

    val n = arr.size
    var gap = n / 2

    while (gap > 0) {
        var i = gap
        while (i < n) {
            val curr = arr[i]
            var j = i
            while (j >= gap && (arr[j - gap] > curr)) {
                arr[j] = arr[j - gap]
                j -= gap
            }
            arr[j] = curr
            i += 1
        }
        gap /= 2
    }
}