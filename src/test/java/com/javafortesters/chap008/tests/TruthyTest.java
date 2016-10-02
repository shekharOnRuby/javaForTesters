package com.javafortesters.chap008.tests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Shekhar on 29/09/2016.
 */
public class TruthyTest {
    boolean truthy = true;

    @Test
    public void assertTruthy(){
        if (truthy) assertTrue(true);
    }


}
