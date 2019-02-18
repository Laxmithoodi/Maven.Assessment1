package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

//        char[] charArray = input.toCharArray();
//        int count = 0;
//        int i = 0;
//
//        while (i < charArray.length) {
//            if(charArray[i] == charArray[charArray.length -i -1]) {
//                count++;
//                i++;
//            }
//        }
//
//            return count+i;

        int globalCount = input.length();
        for (int mid = 1; mid < input.length() - 1; mid++) {
            int count = 0;

            int low = mid - 1;
            int high = mid + 1;
            while (low >= 0 && high < input.length() && input.charAt(low--) == input.charAt(high++))
                count++;

            globalCount += count;
            count = 0;

            low = mid - 1;
            high = mid;
            while (low >= 0 && high < input.length() && input.charAt(low--) == input.charAt(high++))
                count++;

            globalCount += count;
        }

        return globalCount;
    }
}
