/**
 * Created by shekhar.karande on 31/08/2016.
 */

package com.javafortesters.chap004testwithotherclasses.examples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {
    @Test
    public void integerExploration(){
        Integer four = new Integer(5);
        assertEquals("intValue returns 4", 5, four.intValue());

    }

    @Test
    public void toHexString(){
        assertEquals("11 becomes b","b",Integer.toHexString(11));
        assertEquals("10 becomes a","a",Integer.toHexString(10));
        assertEquals("3 becomes 3","3",Integer.toHexString(3));
        assertEquals("21 becomes 15","15",Integer.toHexString(21));
    }

    @Test
    public void verifyMinAndMaxInteger(){
        assertEquals("min int value",-2147483648,Integer.MIN_VALUE);
        assertEquals("min int value",2147483647,Integer.MAX_VALUE);

    }
}
