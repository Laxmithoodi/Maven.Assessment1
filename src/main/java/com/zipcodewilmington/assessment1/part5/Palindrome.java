package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        char[] charArray = input.toCharArray();
        int count = 0;
        int i = 0;

        while (i < charArray.length) {
            if(charArray[i] == charArray[charArray.length -i -1]) {
                count++;
                i++;
            }
        }

            return count+i;
    }
}
