package com.google.automation.automationTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DiMA on 6/14/17.
 */
class HashMapTest {
    public static void main(String args[]) {

        // create and populate hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Dmytro");
        map.put(102, "Jay");
        map.put(103, "Data");

        System.out.println("Values before remove: " + map);

        // Remove value for key 102
        map.remove(102);

        System.out.println("Values after remove: " + map);
    }
}
