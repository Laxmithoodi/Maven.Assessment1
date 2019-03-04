package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int count = input.length();
        for(int i = 0; i < input.length(); i++)
        {
            for(int j = i+2; j <= input.length(); j++)
            {
                count += isPalindrome(input.substring(i, j));
            }
        }
        return count;
    }
    public static int isPalindrome(String a)
    {
        for(int i = 0; i < a.length() / 2; i++)
        {
            if(a.charAt(i) != a.charAt(a.length() - 1 - i))
                return 0;
        }
        return 1;
    }
}
