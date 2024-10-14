package org.tw.array;

import java.util.*;

public class A3_RemoveDuplicatesFromArray {

    private static void usingSet() {
        int [] intArr = {10, 10, 20, 20, 30, 40,40};

        Set<Integer> set = new LinkedHashSet<>();
        for (int i : intArr) {
            set.add(i);
        }

        System.out.println(set);
    }

    private static void usingStream() {
        int [] intArr = {10, 10, 20, 20, 30, 40,40};

        intArr = Arrays.stream(intArr).distinct().toArray();

        System.out.println(Arrays.toString(intArr));
    }

    public static void main(String[] args) {
        usingSet();
        usingStream();
    }
}
