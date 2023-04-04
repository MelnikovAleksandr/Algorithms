package sorting

/**
 * Sorts the given array using the quicksort algorithm.
 *
 * Worst-Case time complexity O(n^2)
 * Best-Case time complexity O(n.log(n))
 * Average-Case time complexity O(n.log(n))
 * Space Complexity O(n.log(n))
 * Stable Sorting No
 *
 * @param arr the array to be sorted
 */

fun quickSort(arr: IntArray) {
    if (arr.size <= 1) return
    quickSortUtil(arr, 0, arr.size - 1)
}

/**
 * A utility function to perform the quicksort algorithm recursively.
 *
 * @param arr the array to be sorted
 * @param left the index of the leftmost element in the partition range
 * @param right the index of the rightmost element in the partition range
 */

fun quickSortUtil(arr: IntArray, left: Int, right: Int) {

    if (left >= right) return

    val pivot = arr[left + (right - left) / 2]
    val index = partition(arr, left, right, pivot)
    quickSortUtil(arr, left, index - 1)
    quickSortUtil(arr, index, right)
}

/**
 * A utility function to partition the array around the pivot.
 *
 * @param arr the array to be partitioned
 * @param left the index of the leftmost element in the partition range
 * @param right the index of the rightmost element in the partition range
 * @param pivot the value of the pivot element
 * @return the index of the element that separates the two partitions
 */

fun partition(arr: IntArray, left: Int, right: Int, pivot: Int): Int {
    var l = left
    var r = right
    while (l <= r) {
        while (arr[l] < pivot) {
            l++
        }
        while (arr[r] > pivot) {
            r--
        }
        if (l <= r) {
            arr.swap(l, r)
            l++
            r--
        }
    }
    return l
}

/**
 * A utility function to swap two elements in an array.
 *
 * @param i the index of the first element to be swapped
 * @param j the index of the second element to be swapped
 */

fun IntArray.swap(i: Int, j: Int) {
    val tmp = this[i]
    this[i] = this[j]
    this[j] = tmp
}
