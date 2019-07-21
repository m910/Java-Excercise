package com.stackroute.pe1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VowelConsonentTest {
    VowelConsonent vowelConsonent;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.vowelConsonent = new VowelConsonent();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
    }
    @Test
    public  void givenCharacterIsVowel(){
    String expectedOutput ="i is a vowel";

    //act
    String actualResult = vowelConsonent.vowelConsonent("is a vowel");

    //assert
        Assert.assertEquals(expectedOutput, actualResult);
}
    @Test
    public  void givenCharacterIsConsonent(){
        String expectedOutput1 ="b is a consonent";

        //act
        String actualResult1 = vowelConsonent.vowelConsonent("is a consonent");

        //assert
        Assert.assertNotEquals(expectedOutput1, actualResult1);
    }


}

