package com.stackroute.pe1;

public class GuessingTheNumber {

    public String guessingTheNumber(int n){
        int x=45;



        if(n>=1 && n<=50){
            if(n==x){
                return "number guessed matches with the original number";
            }
            else if(n>x){
                return "number guessed is greater than the original number";

            }
            else{
                return "number guessed is smaller than the original number";
            }

        } return null;

    }
}
