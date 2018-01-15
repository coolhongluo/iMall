package com.service.myprojectname.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMyprojectname {

        MyprojectnameDelegate myprojectnameDelegate = new MyprojectnameDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = myprojectnameDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}