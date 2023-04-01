package median_of_two_sort_arrays

import java.lang.Integer.min

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val m = nums1.size
    val n = nums2.size

    // swap arrays to make sure nums1 is always the smaller one
    if (m > n) {
        return findMedianSortedArrays(nums2, nums1)
    }

    var left = 0
    var right = m
    var median = 0.0

    while (left <= right) {
        // partition nums1 and nums2
        val partitionX = (left + right) / 2
        val partitionY = (m + n + 1) / 2 - partitionX

        // find max/min elements on the left and right sides
        val maxLeftX = if (partitionX == 0) Int.MIN_VALUE else nums1[partitionX - 1]
        val minRightX = if (partitionX == m) Int.MAX_VALUE else nums1[partitionX]
        val maxLeftY = if (partitionY == 0) Int.MIN_VALUE else nums2[partitionY - 1]
        val minRightY = if (partitionY == n) Int.MAX_VALUE else nums2[partitionY]

        // check if partition is correct
        if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
            // calculate median based on partition
            median = if ((m + n) % 2 == 0) {
                (maxLeftX.coerceAtLeast(maxLeftY) + min(minRightX, minRightY)) / 2.0
            } else {
                maxLeftX.coerceAtLeast(maxLeftY).toDouble()
            }
            break
        } else if (maxLeftX > minRightY) {
            // partition is too big, move to the left
            right = partitionX - 1
        } else {
            // partition is too small, move to the right
            left = partitionX + 1
        }
    }

    return median
}
