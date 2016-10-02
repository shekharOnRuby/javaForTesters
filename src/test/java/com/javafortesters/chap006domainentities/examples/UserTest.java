package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shekhar.karande on 13/09/2016.
 */
public class UserTest {
    User[] userArray = new User[100];

    public void assignUsers(){

    }

    @Test
    public void testUserArray(){
        for(int i = 0; i<userArray.length;i++){
            userArray[i] = new User("user"+i,"pass"+i);
        }
        for(User arrItem:userArray){
            System.out.println(arrItem.getUserName()+ " | " + arrItem.getPassword());
        }

        assertEquals("user21",userArray[21].getUserName());
        assertEquals("pass23",userArray[23].getPassword());
        assertEquals(100,userArray.length);
    }

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
