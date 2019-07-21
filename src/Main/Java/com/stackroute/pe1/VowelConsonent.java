package com.stackroute.pe1;

import java.util.Scanner;

public class VowelConsonent {
    public String vowelConsonent(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                return word.charAt(i) + " is a vowel";

            } else
                return word.charAt(i) + " is a consonent";
        }

return result;


    }



    }

