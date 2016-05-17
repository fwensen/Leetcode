package com.vincent.array;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by vincent on 2016/5/12.
 */
public class TestJunit {


    @Before
    public void beforeTest() {
        System.out.println("before test");
    }


    @Test
    public void beginTest() {
        System.out.println("begin test!");
    }
}
