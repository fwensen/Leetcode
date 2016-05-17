package com.vincent.array;

/** TAG: Array, difficulty: Medium
 * Created by vincent on 2016/5/16.
 *  problem 153:
 *  Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 *  Find the minimum element.
 *  You may assume no duplicate exists in the array.
 */
public class FindMinimuminRotatedSortedArray {

    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;
        while (left < right) {

            int mid = left + (right - left)/2;

            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return nums[right];
    }
}