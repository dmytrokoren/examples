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


  public static void main(String[] args) { //converts string to lowercase and replaces everything except numbers and alphabets
        String s = "b o  b".toLowerCase().replaceAll("\\W", "");
        int j=0;
        int k = s.length() - 1;
        while(j < s.length() / 2) {
        //loops until half the length of the string if 
        //even and floor value if odd.
            if (s.charAt(j++) != s.charAt(k--)){
        //check for first and last chars                                                                                                
        //and  go inwards. if char do not match print 'false' and exit 
            System.out.println("false");
            System.exit(0);}
        }
        System.out.println("true"); //if every chars match print "true"
    }
