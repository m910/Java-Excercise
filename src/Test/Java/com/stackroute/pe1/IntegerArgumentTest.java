package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerArgumentTest {

    IntegerArgument integerArgument;

    @Before
    public void setUp() throws Exception {

        integerArgument=new IntegerArgument();
    }

    @After
    public void tearDown() throws Exception {

        integerArgument=null;
    }


    @Test
    public void givenArrayGivesSum(){
        int input[]={12,34,23};
        assertEquals(69,integerArgument.addingTheArray(3,input));
    }


    @Test
    public void givenArrayGivesOutput(){
        int input[]={1,2,3,4,5,6,7};
        assertEquals(28,integerArgument.addingTheArray(7,input));
    }

    @Test
    public void givenArrayGivesNotEqualOutput(){
        int input[]={1,2,3,4,5,6,6};
        assertNotEquals(28,integerArgument.addingTheArray(7,input));
    }

    @Test
    public void nullInput(){
        assertEquals(0,integerArgument.addingTheArray(4,null));
    }


}