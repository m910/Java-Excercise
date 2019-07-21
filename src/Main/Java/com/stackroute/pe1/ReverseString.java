package com.stackroute.pe1;

import java.util.Scanner;

public class ReverseString {
    public String ReverseString(String s)
    {
        String x="";

        for(int i=s.length()-1;i>=0;i--)
        {
            x=x+s.charAt(i);
        }
        return x;

    }
}
