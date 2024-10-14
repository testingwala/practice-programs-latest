package org.tw.string;

import java.util.HashMap;
import java.util.Map;

public class S6_StringCountCharacterOccurrences {

    public static void main(String[] args) {
        String str = "shriniwas";

        Map<Character, Integer> map = new HashMap<>();

        char [] strArr = str.toCharArray();

        for (char ch: strArr) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}
