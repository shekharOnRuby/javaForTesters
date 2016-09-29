package com.javafortesters.chap008.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shekhar on 29/09/2016.
 */
public class SelectionAndDecisions {
    @Test
    public void testCats(){
        Integer numberOfCats =11;
        String testString = numberOfCats < 2? "Cat": "Cats";
        assertEquals("Cats",testString);
    }

// do not understand assertEquals implementation
    @Test
    public void testCatsTwo(){
        assertEquals("1==cat","cat",catOrCats(1));
        assertEquals("0==cat","cats",catOrCats(0));
        assertEquals("2==cats","cats",catOrCats(2));
    }

    private String catOrCats(int i) {
        return (i == 0 || i >1) ? "cats":"cat";

    }
}
