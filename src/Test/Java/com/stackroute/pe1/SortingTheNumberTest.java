package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheNumberTest {

    SortingTheNumber sortingTheNumber;

    @Before
    public void setUp() throws Exception {

        sortingTheNumber=new SortingTheNumber();
    }

    @After
    public void tearDown() throws Exception {

        sortingTheNumber=null;
    }

    @Test
    public void givenTheInputIsSortedInNonIncreasingOrder(){
        int[] output={4,2,1,3,5};

        assertEquals(6,sortingTheNumber.sortinTheGivenNumber(output,5));
    }
}