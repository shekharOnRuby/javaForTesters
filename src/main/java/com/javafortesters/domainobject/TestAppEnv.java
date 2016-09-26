package com.javafortesters.domainobject;

/**
 * Created by shekhar.karande on 08/09/2016.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl(){
        return "http://"+DOMAIN+":"+ PORT;
    }
}
