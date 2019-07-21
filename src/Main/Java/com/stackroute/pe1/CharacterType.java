package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterType {
    public String typeOfCharacter(char inputCharacter) {
        String result="";
        if (inputCharacter >= 65 && inputCharacter <= 90) {
            return "It is a capital letter";
        }
        String results="";{
         if (inputCharacter >= 97 && inputCharacter <= 122)
           return "It is a small letter";}


         if (inputCharacter >= 47 && inputCharacter <= 57)
            return "It is a number";

        else
            return "It is a special character";


    }

}
