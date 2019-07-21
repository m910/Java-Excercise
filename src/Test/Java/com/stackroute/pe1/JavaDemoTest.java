package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JavaDemoTest {
    JavaDemo javaDemo;
    @Before
    public void setUp(){
        //arrange
        System.out.println("Inside Before");
        this.javaDemo=new JavaDemo();

    }

    @After
    public void tearDown(){
        System.out.println("Inside After");
        javaDemo=null;
    }
    @BeforeClass
    public  static void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Test
    public void givenTwoStringShouldReturnConcattedString() {
        //arrange
        JavaDemo javaDemo=new JavaDemo();
        //act
        String actualResult=javaDemo.concatAndUpperCase("Hello","World");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD",actualResult);

    }
    @Test
    public void givenAStringAndNullShouldReturnErrorMessage(){
        //arrange
        JavaDemo javaDemo=new JavaDemo();
        //act
        String actualResult=javaDemo.concatAndUpperCase("Hello",null);
        //assert
        assertNotNull(actualResult);
        assertEquals("null value not allowed",actualResult);
    }
    @Test
    public void givenStringshouldReturnErrorMessage(){
        //act
        String actualResult=javaDemo.concatAndUpperCase("Hello",null);
        //assert
        assertNotNull(actualResult);
        assertEquals("null value not allowed",actualResult);
    }
    @Test
    public void givenStringShouldReturnTheReverse(){
        //act
        String actualResult=javaDemo.reverseString("Hello");
        //assert
        assertEquals("olleH",actualResult);
    }
//    @Test
//    public void givenStringShouldThrowNullPointerException(){
//        //act
//        String actualResult=javaDemo.reverseString(null);
//
//
//    }

}