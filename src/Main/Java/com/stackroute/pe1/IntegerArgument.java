package com.stackroute.pe1;

public class IntegerArgument {

    public int addingTheArray(int n,int[] arr){

        if(arr==null)
            return 0;
        int sum=0;

        for(int i=0;i<n;i++){

            sum=sum+arr[i];

        }
        return sum;

    }
}
