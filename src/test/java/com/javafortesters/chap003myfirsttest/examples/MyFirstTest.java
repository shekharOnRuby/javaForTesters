/**
 * Created by shekhar.karande on 31/08/2016.
 */

package com.javafortesters.chap003myfirsttest.examples;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo( ){
        int answer = 2+3;
        assertEquals("2+2=4",5, answer);
    }

    @Test
    public void canMultiplyTwoAndTwo(){
        int answer = 4;
        assertEquals("2*2=4",4,answer);
    }
}
