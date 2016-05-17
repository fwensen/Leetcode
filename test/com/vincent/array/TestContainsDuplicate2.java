package com.vincent.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vincent on 2016/5/14.
 */
public class TestContainsDuplicate2 {

    @Test
    public void testContainsDup() {

        int [] nums1 = {0, 0, 0, 0, 0};
        int [] nums2 = {};
        int [] nums3 = new int[10000];
        for (int i = 0; i < 10000; i++) nums3[i] = i;
        int [] nums4 = {2, 3, 4, 5, 3,  5, 6, 7, 8, 9};
        int [] nums5 = {1, 2, 3,4, 5, 6, 2, 8, 9};

        Assert.assertTrue(true == ContainsDuplicate2.containsNearbyDuplicate1(nums1, 3));
        Assert.assertTrue(false == ContainsDuplicate2.containsNearbyDuplicate1(nums2, 3));
        Assert.assertTrue(false == ContainsDuplicate2.containsNearbyDuplicate1(nums3, 4));
        Assert.assertTrue(true == ContainsDuplicate2.containsNearbyDuplicate1(nums4, 3));
        Assert.assertTrue(false == ContainsDuplicate2.containsNearbyDuplicate1(nums5, 4));
    }

}
