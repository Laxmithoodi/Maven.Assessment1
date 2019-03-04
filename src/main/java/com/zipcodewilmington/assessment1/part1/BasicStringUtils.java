package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       // String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
        char firstChar = str.charAt(0);
        char upperCase = Character.toUpperCase(firstChar);

        String tail = str.substring(1);

        return upperCase+tail;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder();
       // return sb.reverse(str);
        return null;
        }

//        char[] in = str.toCharArray();
//        int begin=0;
//        int end=in.length-1;
//        char temp;
//        while(end>begin){
//            temp = in[begin];
//            in[begin]=in[end];
//            in[end] = temp;
//            end--;
//            begin++;
//        }
//
//        return new String(in);


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reverseCharacter = reverse(str);
        String cap1 = reverseCharacter.substring(0, 1).toUpperCase() + reverseCharacter.substring(1);

        return cap1;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = str.substring(1, str.length()-1);
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

            return result;
        }
//        StringBuilder sb = new StringBuilder(str.length());
//
//        for (char letter : str.toCharArray()) {
//            if (Character.isUpperCase(letter)) {
//                letter = Character.toLowerCase(letter);
//            } else if (Character.isLowerCase(letter)) {
//                letter = Character.toUpperCase(letter);
//            }
//            sb.append(letter);
//        }
//
//        String str2 = sb.toString();
//
//        return str2;
    }

