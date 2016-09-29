package com.javafortesters.chap008.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shekhar on 29/09/2016.
 */
public class SwitchTests {
    @Test
    public void testShortCode(){
        assertEquals("United Kingdom",getShortCode("uk"));
        assertEquals("United States",getShortCode("USA"));
        assertEquals("United States",getShortCode("US"));
        assertEquals("France",getShortCode("FR"));
        assertEquals("Sweden",getShortCode("SE"));
    }

    @Test
    public void testInteger(){
        assertEquals("One",getInteger(1));
        assertEquals("Two",getInteger(2));
        assertEquals("Three",getInteger(3));
        assertEquals("Four",getInteger(4));
        assertEquals("Too Small",getInteger(0));
        assertEquals("Too Big",getInteger(6));
    }

    private String getInteger(Integer number) {
        String returnValue;
        switch (number){
            case (0):
                returnValue = "Too Small";
                break;
            case (1):
                returnValue = "One";
                break;
            case (2):
                returnValue = "Two";
                break;
            case (3):
                returnValue = "Three";
                break;
            case (4):
                returnValue = "Four";
                break;
            default:
                returnValue = "Too Big";
                break;
        }
        return returnValue;
    }

    public String getShortCode(String shortCode){
        String likelyShortCode = "";
        switch (shortCode.toLowerCase()){
            case "uk":
                likelyShortCode = "United Kingdom";
                break;
            case "usa":
                likelyShortCode = "United States";
                break;
            case "us":
                likelyShortCode = "United States";
                break;
            case "fr":
                likelyShortCode = "France";
                break;
            case "se":
                likelyShortCode = "Sweden";
                break;
        }
        return likelyShortCode;
    }

}