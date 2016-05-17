package com.vincent.array;

/**
 * Created by vincent on 2016/5/14.
 * Given a sorted array, remove the duplicates in place
 *     such that each element appear only once and return the new length.

 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int len = nums.length, n = len;
        for (int i = 1, j = 0; i < n; i++) {
            if (nums[j] < nums[i]) {
                j++;
                nums[j] = nums[i];
            } else {
                len--;
            }
        }
        return len;
    }
}