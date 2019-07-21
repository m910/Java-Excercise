package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat;

    @Before
    public void setUp() throws Exception {

        stringRepeat=new StringRepeat();
    }

    @After
    public void tearDown() throws Exception {
        stringRepeat=null;
    }


    @Test
    public void givenStringRepeatsItself(){
        assertEquals("StackRouteRouteRouteRouteRouteRoute",stringRepeat.stringRepeatating(5,"StackRoute"));
    }


    @Test
    public void givenStringRepeatsAsPerTheInput(){
        assertEquals("StackRoutetete",stringRepeat.stringRepeatating(2,"StackRoute"));
    }


    @Test
    public void givenStringIsNotEqual(){
        assertNotEquals("StackRoute",stringRepeat.stringRepeatating(2,"StackRoute"));
    }

    @Test
    public void nullInput(){
        assertEquals("null",stringRepeat.stringRepeatating(0,"null"));
    }
}