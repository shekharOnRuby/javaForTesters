package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shekhar.karande on 13/09/2016.
 */
public class UserTest {
    @Test
    public void canConstructANewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultUserNameAndPassword(){
        User user = new User("admin","pA55w0rD");

        assertEquals("default username expected","admin",user.getUserName());

        assertEquals("default password expected","pA55w0rD",user.getPassword());
    }

    @Test
    public void canSetUserPassword(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("password expected","PaZZwor6",user.getPassword());
    }
}
