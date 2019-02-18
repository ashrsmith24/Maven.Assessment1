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
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        char[] reverse = str.toCharArray();
        // make while loop
        int i = 0, j = reverse.length - 1;
        while (i < j) {

            char t = reverse[i];
            reverse[i] = reverse[j];
            reverse[j] = t;
            i++;
            j--;
        }
        // return
        return String.valueOf(reverse);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
//        int arrayLength = str.length();
//        String[] words = str.split(" ");
//        for (String word : words)
//        {
//            String reverseWord = new StringBuilder(word).reverse().toString();
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}