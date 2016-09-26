package com.javafortesters.domainentities;

/**
 * Created by shekhar.karande on 13/09/2016.
 */
public class User {
    private String username;
    private String password;

    public User(){
        this("username","password");
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getPassword() {
        return password;

    }

    public String getUserName(){
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
