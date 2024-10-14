package org.tw.miscellaneous;

import java.util.*;

public class M3_FindSecondHighestPair {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 5);
        map.put(3, 11);
        map.put(1, 12);
        map.put(4, 11);

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            list.add(m.getKey()+m.getValue());
        }

        list.sort(Comparator.reverseOrder());

        Map<Integer, Integer> newMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int sumOfPairs = m.getKey() + m.getValue();
            // Check the sum of key and value is equals to 2nd element in list
            if (sumOfPairs == list.get(1)) {
                newMap.put(m.getKey(), m.getValue());
            }
        }

        System.out.println("Second Highest Pair in Map: " +newMap);
    }
}
