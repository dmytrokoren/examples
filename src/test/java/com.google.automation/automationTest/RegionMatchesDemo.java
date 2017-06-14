package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class RegionMatchesDemo {
        public static void main(String[] args) {
            String searchMe = "Green Eggs and Ham";
            String findMe = "Green1";
            int searchMeLength = searchMe.length();
            int findMeLength = findMe.length();
            boolean foundIt = false;
            for (int i = 0;
                 i <= (searchMeLength - findMeLength);
                 i++) {
                if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                    foundIt = true;
                    System.out.println(searchMe.substring(i, i + findMeLength));
                    break;
                }
            }
            if (!foundIt)
                System.out.println("No match found.");
        }
    }