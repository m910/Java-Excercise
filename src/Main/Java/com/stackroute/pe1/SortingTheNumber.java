package com.stackroute.pe1;

public class SortingTheNumber {

    public int sortinTheGivenNumber(int arr[],int m){
        int input,rev,sum=0;

        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){

                if(arr[i]<arr[j]){
                    rev=arr[i];
                    arr[i]=arr[j];
                    arr[j]=rev;
                }
            }

            input=arr[i];

            if(input%2==0) {
                sum = sum + input;
            }
        }

        System.out.println("Non-increasing order:");

        for(int i=0;i<m-1;i++){
            System.out.print(arr[i]+ ",");
        }

        System.out.print(arr[m-1]+ "\n");

        System.out.println("sum of even numbers :" +sum);

        if(sum>15) {
            System.out.println("true");
        }

        else
            System.out.println("false");

        return sum;




    }
}
