package com.stackroute.pe1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
    ReverseString reverseString;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.reverseString = new ReverseString();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        reverseString = null;
    }
    @Test
    public void givenStringIsReversed() {
        String expectedOutput ="nodnol";

        //act
        String actualResult = reverseString.ReverseString("london");

        //assert
        Assert.assertEquals(expectedOutput, actualResult);
    }


    }
