package com.stackroute;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                System.out.println(word.charAt(i) + " is a vowel");

            } else {
                System.out.println(word.charAt(i) + " is a consonent");

            }
        }
    }



    }

