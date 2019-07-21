package com.stackroute.pe1;

import org.junit.*;

import java.lang.*;

public class CharacterTypeTest {
    CharacterType characterType;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.characterType = new CharacterType();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        characterType = null;
    }

    @Test
    public void givenACharacterShouldReturnSmallCharacter() {

        String expectedOutput = "It is a small letter";

        //act
        String actualResult = characterType.typeOfCharacter('f');

        //assert
        Assert.assertEquals("It is a small letter",actualResult);

    }
    @Test
    public void givenACharacterShouldReturnCapitalCharacter(){
        String expectedOutput="It is a capital letter";
        //act
        String actualResult = characterType.typeOfCharacter('A');
        //assert
        Assert.assertEquals("It is a capital letter",actualResult);
    }


    @Test
    public void givenACharacterShouldreturnNumber(){
        String expectedOutput="It is a number";
        //act
        String actualResult = characterType.typeOfCharacter('5');
        //assert
        Assert.assertEquals("It is a number",actualResult);

    }

}
