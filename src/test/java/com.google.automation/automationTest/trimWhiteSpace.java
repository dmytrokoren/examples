package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class trimWhiteSpace {
    public static void main(String[] args) {
            String str = "         Hello!   ";
            String trimmedStr = str.trim();
            System.out.println("Original String is \"" + str + "\".");
            System.out.println("Trimmed String is \"" + trimmedStr + "\".");
        }
    }
