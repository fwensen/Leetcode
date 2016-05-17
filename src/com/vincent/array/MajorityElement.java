package com.vincent.array;

import java.util.Arrays;

/**
 * Created by vincent on 2016/5/12.
 *
 *    Given an array of size n, find the majority element.
 *    The majority element is the element that appears more than 鈱� n/2 鈱� times.
 *        You may assume that the array is non-empty and the majority element
 *        always exist in the array.
 */
public class MajorityElement {

    // 5ms
    public int majorityElement(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);
        int max  = 1, maxValue = nums[0], i = 0;

        while (i < len) {
            int val = nums[i];
            int tmp = 1;
            while ((i + 1) < len && val == nums[i + 1]) {
                tmp++;
                i++;
            }
            if (tmp > 1) i--;

            if (tmp > max ) {
                max = tmp;
                maxValue = val;
            }
            i++;
        }
        return maxValue;
    }

    // 2ms
    public int majorityElement2(int [] nums) {

        int max = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (max == nums[i]) {
                count++;
            }
            else if (count == 0) {
                max = nums[i];
                count++;
            } else {
                count--;
            }
        }
        return max;
    }




}
