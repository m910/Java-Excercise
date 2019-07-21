package com.stackroute.pe1;

public class Palindrome {

    public String checkForPalindrome(String original) {

        if(original==null)
            return null;

        String str1 = original, str2 = "";


        for (int i = str1.length() - 1; i >= 0; i--)

            str2 = str2 + str1.charAt(i);

            if (str1.equals(str2)) {

                int result = Integer.parseInt(str1);

                int sum = 0;

                while (result > 0) {
                    int rem = result % 10;

                    if (rem % 2 == 0) {
                        sum = sum + rem;
                    }
                    result = result / 10;
                }


                if (sum > 25) {
                    return "It is a palindrome and sum of even numbers is greater than 25";
                }

                else
                    return "It is a palindrome and sum of even numbers is less than 25";
            }

            else {
                return "It is not palindrome";
            }

    }

}





