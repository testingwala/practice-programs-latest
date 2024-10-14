package org.tw.array;

import java.util.*;

public class A10_FindCommonElements {

    private static void usingHashMap() {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            }
            else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {System.out.println(m.getKey());}
        }
    }

    private static void usingSet() {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6 };

        Set<Integer> set = new HashSet<>();

        List<Integer> list = new ArrayList<>();

        for (int value : arr) {
            if (set.contains(value)) {
                list.add(value);
            } else {
                set.add(value);
            }
        }

        System.out.println(list);
    }


    private static void usingArrayList() {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6 };

        List<Integer> list = new ArrayList<>();

        for (int value : arr) {
            if (list.contains(value)) {
                System.out.println("Duplicate Value:" +value);
            } else {
                list.add(value);
            }
        }
    }

    public static void main(String[] args) {
        usingHashMap();
        usingSet();
        usingArrayList();
    }
}
