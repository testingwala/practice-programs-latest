package org.tw.string;

import java.util.HashMap;
import java.util.Map;

public class S12_StringCountStringOccurrences {

    public static void main(String[] args) {
        String str = "Test Automation Java Automation";

        String [] strArr = str.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String st : strArr) {

            if (map.containsKey(st)) {
                map.put(st, map.get(st) + 1);
            } else {
                map.put(st, 1);
            }
        }

        System.out.println(map);
    }
}
