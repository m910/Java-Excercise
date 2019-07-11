package com.stackroute;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.println(i);
            }

        }


    }
}
