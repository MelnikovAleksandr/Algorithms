package sorting

/**
 * This function sorts an array of integers using the merge sort algorithm.
 *
 * Worst-Case time complexity O(n.log(n)).
 * Best-Case time complexity O(n.log(n)).
 * Average-Case time complexity O(n.log(n)).
 * Space Complexity O(n).
 * Stable Sorting Yes.
 *
 * @param array the array to be sorted.
 * @return the sorted array.
 *
 */

fun mergeSort(array: IntArray): IntArray {

    if (array.size <= 1) {
        return array
    }

    val middle = array.size / 2
    val left = array.copyOfRange(0, middle)
    val right = array.copyOfRange(middle, array.size)
    return merge(mergeSort(left), mergeSort(right))
}

/**
 * This function merges two sorted arrays into a single sorted array.
 *
 * @param left the array to merge.
 * @param right the right array to merge.
 * @return the merged and sorted array.
 */

fun merge(left: IntArray, right: IntArray): IntArray {
    val result = IntArray(left.size + right.size)
    var leftIndex = 0
    var rightIndex = 0
    var resultIndex = 0

    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
            result[resultIndex] = left[leftIndex]
            leftIndex++
        } else {
            result[resultIndex] = right[rightIndex]
            rightIndex++
        }
        resultIndex++
    }
    System.arraycopy(left, leftIndex, result, resultIndex, left.size - leftIndex)
    System.arraycopy(right, rightIndex, result, resultIndex, right.size - rightIndex)
    return result
}











