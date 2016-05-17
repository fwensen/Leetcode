package com.vincent.array;

/**
 * Created by vincent on 2016/5/11.
 * TAG: array
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.

 * Hint:

 * Try two pointers.
 * Did you use the property of "the order of elements can be changed"?
 * What happens when the elements to remove are rare?
 *
 */
public class RemoveElements {

    public int removeElement(int[] nums, int val) {

        int end = nums.length - 1;
        int i = 0;
        //int count = 0;
        for (; i <= end; i++) {

            if (nums[i] != val) {
                continue;
            }

            int j = i + 1;
            while (j <= end && nums[j] == val) {
                j++;
            }
            if (j > end)
                break;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        int j = end;
        while (j >= 0 && nums[j] == val)
            j--;

        return j + 1;

    }

    public static  void main(String[] args) {
        RemoveElements re = new RemoveElements();
        int [] nums = {3};
        int ret = re.removeElement(nums, 3);
        System.out.println("ret: "+ret);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
