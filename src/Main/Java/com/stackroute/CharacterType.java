package com.stackroute;

import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner scan = new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if (ch>=65 && ch<=90)
            System.out.println("It is a capital letter");

        else if(ch>=97 && ch<=122)
                System.out.println("It is a small letter");


        else if(ch>=47 && ch<=57)
                System.out.println("It is a number");

        else
                System.out.println("It is a special character");


    }
}
