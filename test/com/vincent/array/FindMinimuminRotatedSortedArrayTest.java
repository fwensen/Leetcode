package com.vincent.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vincent on 2016/5/16.
 */
public class FindMinimuminRotatedSortedArrayTest {

    FindMinimuminRotatedSortedArray fmrsa;
    @Before
    public void setUp() {
        fmrsa = new FindMinimuminRotatedSortedArray();
    }

    @Test
    public void testFindMinRotatedSortedArray() {

        int [] nums1 = {1,2};
        int [] nums2 = {6,7,8,9,2,3,4,5};
        int [] nums3 = {1};
        int [] nums4 = {2,3,4,5,6,7,8,9,1};
        Assert.assertTrue(1 == fmrsa.findMin(nums1));
        Assert.assertTrue(2 == fmrsa.findMin(nums2));
        Assert.assertTrue(1 == fmrsa.findMin(nums3));
        Assert.assertTrue(1 == fmrsa.findMin(nums4));
    }
}
