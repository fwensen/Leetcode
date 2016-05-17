package com.vincent.array;

import org.junit.Test;

/**
 * Created by vincent on 2016/5/14.
 */
public class TestMoveZeros {

    private void print(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void testMoveZeros() {
        int [] nums1 = {0, 0, 0, 0, 0, 0, 0};
        int [] nums2 = {0, 1, 0, 0, 2, 4, 5, 0, 0, 0, 0, 7, 0, 0, 0, 0};
        int [] nums3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] nums4 = {1, 0};
        MoveZeros.moveZeroes(nums1);
        MoveZeros.moveZeroes(nums2);
        MoveZeros.moveZeroes(nums3);
        MoveZeros.moveZeroes(nums4);
        print(nums1);
        print(nums2);
        print(nums3);
        print(nums4);
    }

}
