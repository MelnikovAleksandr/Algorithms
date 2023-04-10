package sorting

/**
 *
 * Problem: Given an array containing 0s and 1s.
 * Write an algorithm to sort the array so that 0s come first, followed by 1s.
 * Also, find the minimum number of swaps required to sort the array.
 *
 * Time complexity looks like a quadratic (loop inside a loop) but it is linear or O(n).
 *
 * @param arr the array of 0s and 1s to be sorted
 * @param size the size of the array
 * @return the minimum number of swaps required to perform the sorting
 *
 */

fun partition01(arr: IntArray, size: Int): Int {

    var left = 0
    var right = size - 1
    var count = 0
    while (left < right) {
        while (arr[left] == 0) left += 1
        while (arr[right] == 1) right -= 1
        if (left < right) {
            swap(arr, left, right)
            count += 1
        }
    }
    return count
}

fun swap(arr: IntArray, first: Int, second: Int) {
    val temp = arr[first]
    arr[first] = arr[second]
    arr[second] = temp
}
