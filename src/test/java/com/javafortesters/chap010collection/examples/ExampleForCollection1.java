package com.javafortesters.chap010collection.examples;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shekhar on 03/10/2016.
 */
public class ExampleForCollection1 {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"Zero","One","Two","Three"};
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("Zero",numbers0123[0]);
        assertEquals("One",numbers0123[1]);
    }
    @Test
    public void simpleCollectionExample(){
        String[] numbers0123Array = {"Zero","One","Two","Three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);

        for(String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("Zero",numbers0123.get(0));
        assertEquals("One",numbers0123.get(1));
    }

    @Test
    public void simpleCollectionExample2() {
        List<String> numbers0123 = new ArrayList<String>();

        numbers0123.add("Zero");
        numbers0123.add("One");
        numbers0123.add("Two");
        numbers0123.add("Three");

        assertEquals("Zero",numbers0123.get(0));
        assertEquals("One",numbers0123.get(1));
    }
}
