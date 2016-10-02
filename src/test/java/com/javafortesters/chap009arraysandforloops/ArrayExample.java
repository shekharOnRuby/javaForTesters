package com.javafortesters.chap009arraysandforloops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shekhar on 02/10/2016.
 */
public class ArrayExample {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"Zero","One","Two","Three"};
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("Zero", numbers0123[0]);
        assertEquals("Three", numbers0123[3]);

    }

    @Test
    public void forLoopUsingIndexFixedCondition(){
        String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String days ="";
        for(int i=0;i <5; i++){
            days = days + " | "+i+" - " +workdays[i];
        }
        assertEquals(
                " | 0 - Monday | 1 - Tuesday | 2 - Wednesday | 3 - Thursday | 4 - Friday",
                days);
    }

    @Test
    public void testSortStrings(){
        String[] workDaysCaps = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        String[] workDaysAssorted = {"monday","Tuesday","wednesday","thursday","Friday"};

        Arrays.sort(workDaysAssorted);
        Arrays.sort(workDaysCaps);

        for(String aString : workDaysAssorted){
            System.out.println(aString);
        }

        assertEquals("Monday",workDaysCaps[1]);
        assertEquals("monday",workDaysAssorted[2]);
    }
}
