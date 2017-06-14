package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class Palindrome {
    public static void main(String[] args) {
        String wort = "madam";
        char[] warray = wort.toCharArray();
        System.out.println(istPalindrom(warray));
    }
    public static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
