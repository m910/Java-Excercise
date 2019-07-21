package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome=new Palindrome();

    }

    @After
    public void tearDown() throws Exception {

        palindrome=null;
    }


    @Test
    public void givenStringIsPalindromeAndSumIsGreaterThanTwentyFive(){

        assertEquals("It is a palindrome and sum of even numbers is greater than 25",palindrome.checkForPalindrome("2468642"));

    }

    @Test
    public void givenStringIsPalindromeAndSumIsSmallerThanTwentyFive(){

        assertEquals("It is a palindrome and sum of even numbers is less than 25",palindrome.checkForPalindrome("1234321"));

    }


    @Test
    public void givenStringIsNotAPalindrome(){

        assertEquals("It is not palindrome",palindrome.checkForPalindrome("12343214"));

    }

}