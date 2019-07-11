package com.stackroute;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0 && n>=20 && n<=30) {
            System.out.println("Jerry");
        }
        else if(n%2!=0 && n>=20 && n<=30){
            System.out.println("Tom");
        }
        else{
            System.out.println("Number is not between te limits");
        }


    }
}
