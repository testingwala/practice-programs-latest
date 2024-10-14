package org.tw.array;

import java.util.*;

public class A9_FindPairsOfAddition {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 15, 2, 8, 3, 4, 11};

        int sum = 17;

        Map<Integer, Integer> map = new HashMap<>();
        List<String> pairs = new ArrayList<>();

        for (int num : arr) {
            int isExistingNum = sum - num;
            if ((map.containsKey(isExistingNum))) {
                pairs.add(Arrays.toString(new Integer[]{num, isExistingNum}));
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(pairs);
    }
}
