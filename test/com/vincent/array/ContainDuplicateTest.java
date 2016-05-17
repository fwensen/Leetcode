package com.vincent.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vincent on 2016/5/15.
 */
public class ContainDuplicateTest {

    ContainsDuplicate cd;

    @Before
    public void beforeTest() {
        cd = new ContainsDuplicate();
    }

    @Test
    public void testDuplicatte() {

        int [] nums1 = {};
        int [] nums2 = {1,2,3,4,5,6,7,8,9};
        int [] nums3 = {1,2,3,4,5,6,7,8,9,4};
        Assert.assertTrue(false == cd.containsDuplicate(nums1));
        Assert.assertTrue(false == cd.containsDuplicate(nums2));
        Assert.assertTrue(true == cd.containsDuplicate(nums3));
    }
}
