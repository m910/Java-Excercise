package com.stackroute.pe1;

public class StringRepeat {

    public String stringRepeatating(int m,String input){

        String output="";

        if(input==null)
            return null;
        for(int i=0;i<m;i++){

            for(int j=input.length()-m;j<input.length();j++){

                output=output+(input.charAt(j));

            }
        }

        String value=(input+output);

        return value;
    }
}
