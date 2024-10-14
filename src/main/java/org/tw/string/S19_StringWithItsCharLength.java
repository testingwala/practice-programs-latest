package org.tw.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class S19_StringWithItsCharLength {

    // Input: aabbcccdd
    // Output: a2b2c3d2

    private static void usingMap() {
        String str = "aabbcccdd";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        StringBuilder stB = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            stB.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(stB);
    }

    private static void usingForLoop() {
        String str = "aabbcccdd";
        int count = 1;

        StringBuilder stB = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((i + 1 < str.length()) && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                stB.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(stB);
    }

    public static void main(String[] args) {
        usingMap();
        usingForLoop();
    }
}
