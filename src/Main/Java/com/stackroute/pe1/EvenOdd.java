package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOdd {
    public String evenOrOdd(int n) {
        String result ="";
        if (n % 2 == 0 && n >= 20 && n <= 30) {
            result = "Jerry";
        }
        if(n % 2 != 0 && n >= 20 && n <= 30) {


            result = "Tom";
        }
        return result;
    }









}
