package com.service.imall.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestImall {

        ImallDelegate imallDelegate = new ImallDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = imallDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}