package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("String : " + "ReverseString");
        System.out.println("Reverse : " + reverseString("ReverseString"));
    }

    public static String reverseString(String inputString) {
        StringBuilder builder = new StringBuilder(inputString);
        return builder.reverse().toString();
    }

    /*public static String reverseString(String inputString){
        char[] chars = inputString.toCharArray();
        int left,right;
        right = chars.length -1;
        for(left = 0; left < right; left++,right--){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        return  new String(chars);
    }*/
}
