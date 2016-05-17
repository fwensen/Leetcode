package com.vincent.array;

/**
 * Created by vincent on 2016/5/11.
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
public class RotateArray {

    // YX = (X^ Y^)^
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int [] nums, int start, int end) {

        if ((end - start) < 1)
            return;

        int mid = (start + end)/2;
        int s = start, e = end;
        while (s <= mid) {
            int tmp = nums[s];
            nums[s] = nums[e];
            nums[e] = tmp;
            s++;
            e--;
        }
    }

    public  static  void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9};
        RotateArray ra = new RotateArray();
        ra.rotate(nums, 4);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
