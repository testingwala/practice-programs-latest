package org.tw.string;

import java.util.*;

public class S28_StringRemoveDuplicateCharacters {

    private static void usingSet() {
        String str = "hello";

        StringBuilder withoutDuplicates = new StringBuilder();

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        for (Character ch : set) {
            withoutDuplicates.append(ch);
        }

        System.out.println("Using Set : " +withoutDuplicates);
    }

    private static void usingMap() {
        String name = "hello";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch: name.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> set = map.keySet();
        StringBuilder strB = new StringBuilder();
        for ( char ch : set){
            strB.append(ch);
        }
        System.out.println("Without Duplicates: " +strB);
    }

    private static void usingStringBuilder() {
        String str = "hello";

        StringBuilder withoutDuplicates = new StringBuilder();

        for ( char ch : str.toCharArray()) {

            if(!withoutDuplicates.toString().contains(String.valueOf(ch))) {
                withoutDuplicates.append(ch);
            }
        }

        System.out.println("Using StringBuilder : " +withoutDuplicates);
    }

    public static void main(String[] args) {
        usingSet();
        usingMap();
        usingStringBuilder();
    }
}
