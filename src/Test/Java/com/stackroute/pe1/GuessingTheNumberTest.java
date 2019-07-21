package com.stackroute.pe1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessingTheNumberTest {
    GuessingTheNumber guessingTheNumber;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.guessingTheNumber = new GuessingTheNumber();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        guessingTheNumber = null;
    }

    @Test
    public void guessingTheNumberIsSameAsOriginalNumber() {
        String expectedOutput = "number guessed matches with the original number";

        //act
        String actualResult = guessingTheNumber.guessingTheNumber(45);

        //assert
        Assert.assertEquals("number guessed matches with the original number", actualResult);

    }
    @Test
    public void guessingTheNumberIsGreaterThanOriginalNumber() {
        String expectedOutput = "number guessed is greater than the original number";

        //act
        String actualResult= guessingTheNumber.guessingTheNumber(65);

        //assert
        Assert.assertNotEquals("number guessed is greater than the original number", actualResult);

    }

    @Test
    public void guessingTheNumberIsSmallerThanOriginalNumber() {
        String expectedOutput = "number guessed is smaller than the original number";

        //act
        String actualResultIs = guessingTheNumber.guessingTheNumber(35);

        //assert
        Assert.assertEquals("number guessed is smaller than the original number", actualResultIs);

    }


}


