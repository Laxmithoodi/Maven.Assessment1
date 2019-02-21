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


//
//        int globalCount = input.length();
//        for (int mid = 1; mid < input.length() - 1; mid++) {
//            int count = 0;
//
//            int low = mid - 1;
//            int high = mid + 1;
//            while (low >= 0 && high < input.length() && input.charAt(low--) == input.charAt(high++))
//                count++;
//
//            globalCount += count;
//            count = 0;
//
//
//
//
//            low = mid - 1;
//            high = mid;
//            while (low >= 0 && high < input.length() && input.charAt(low--) == input.charAt(high++))
//                count++;
//
//            globalCount += count;
//
//
//        }
//
//        return globalCount;
//    }
//}
