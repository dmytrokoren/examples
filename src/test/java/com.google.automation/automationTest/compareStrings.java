package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class compareStrings {
        public static void main(String []args){
            String s1 = "Dmytro";
            String s2 = "Dmytro";
            String s3 = "Mike";
            System.out.println("Two strings equal: " + s1.equals(s2));
            System.out.println("Two strings equal: " + s2.equals(s3));
        }
    }