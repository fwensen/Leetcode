package com.vincent.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
/**
 * Created by vincent on 2016/5/12.
 */
public class TestMajorityElement {

    MajorityElement me = new MajorityElement();

    @Test
    public void testMajorityElement() {

        int [] array1 = {1};
        int [] array2 = {1,2,2};
        int [] array3 = {1, 1, 1, 2};
        int [] array4 = new int[10000];
        for (int i = 0; i < 500; i++) array4[i] = i;
        for (int i = 500; i < 1000; i++) array4[i] = 1000;
        for(int i = 1000; i < 4200; i++) array4[i] = 2000;
        for (int i = 4200; i < 9800; i++) array4[i] = 3000;
        for (int i = 9800; i < 10000; i++) array4[i] = i;

        Assert.assertTrue(1 == me.majorityElement(array1));
        Assert.assertTrue(2 == me.majorityElement(array2));
        Assert.assertTrue(1 == me.majorityElement(array3));
        Assert.assertTrue(3000 == me.majorityElement(array4));
    }

}
