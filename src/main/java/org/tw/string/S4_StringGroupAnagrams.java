package org.tw.string;

import java.util.*;

public class S4_StringGroupAnagrams {

    private static String sortedString(String input) {

        char[] chArr = input.toCharArray();

        Arrays.sort(chArr);

        StringBuilder sorted = new StringBuilder();
        for (char ch : chArr) {
            sorted.append(ch);
        }

        return sorted.toString();
    }

    public static void main(String[] args) {

        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input:: " + Arrays.toString(strArr));

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strArr) {
            String sortedStr = sortedString(str);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        System.out.println("Map: " +map);

        // Convert Map to List of Map Entries
        List<Map.Entry<String, List<String>>> liNew = new ArrayList<>(map.entrySet());

        liNew.sort(Comparator.comparingInt(value -> value.getValue().size()));

        // Create a new LinkedHashMap to maintain sorted order
        Map<String, List<String>> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> entry : liNew) {
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        System.out.println("Output:" +sortedMap.values());
    }
}
