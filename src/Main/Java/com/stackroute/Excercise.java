package com.stackroute;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r,sum=0,temp;

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            if(n%2==0){
                sum=sum+n;
                System.out.println("It is palinadrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
        }
    }
}
