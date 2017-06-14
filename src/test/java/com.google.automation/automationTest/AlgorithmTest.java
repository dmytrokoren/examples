package com.google.automation.automationTest;

/**
 * Created by DiMA on 6/14/17.
 */
public class AlgorithmTest {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = y;
        y = x;
        x = z;
        System.out.println("X= " + x);
        System.out.println("Y= " + y);
    }
}
