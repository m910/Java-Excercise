package com.stackroute.pe1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {
    EvenOdd evenOdd;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.evenOdd = new EvenOdd();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        evenOdd = null;
    }

    @Test
    public void givenNumberIsOdd(){
        String expectedOutput = "Tom";

        //act
        String actualResult = evenOdd.evenOrOdd(23);

        //assert
       Assert. assertEquals("Tom",actualResult);

    }
    @Test
    public void givenNumberIsEven(){
        String expectedOutput ="Jerry";
        //act
        String actualResult = evenOdd.evenOrOdd(26);
        //assert
        Assert.assertEquals("Jerry",actualResult);


    }
}
