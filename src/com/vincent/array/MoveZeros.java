package com.vincent.array;

/**
 * Created by vincent on 2016/5/14.
 * Given an array nums, write a function to move all 0's
 *   to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    //Runtime: 1 ms
    public static void moveZeroes(int[] nums) {

        int len = nums.length;
        int i = 0, j = 0;
        while (i < len && j < len) {
            while ( i < len && nums[i] == 0) i++;
            while ( j < len && nums[j] != 0) j++;
            if (i < len && i > j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j++;
            } else if (i <= j) {
                i = j + 1;
            }
        }
    }
}
