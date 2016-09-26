package com.javafortesters.chap005testwithoutourownclasses.domainobject.example;

import com.javafortesters.domainobject.TestAppEnv.*;
import org.junit.Test;

import static com.javafortesters.domainobject.TestAppEnv.DOMAIN;
import static com.javafortesters.domainobject.TestAppEnv.PORT;
import static com.javafortesters.domainobject.TestAppEnv.getUrl;
import static org.junit.Assert.*;

/**
 * Created by shekhar.karande on 08/09/2016.
 */

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Return Hard Coded URL","http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the domain","192.123.0.3",DOMAIN);
        assertEquals("Just the port","67",PORT);
    }
}
