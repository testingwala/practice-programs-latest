package org.tw.array;

import java.util.*;

public class A1_FindCommonElementsInArrays {

    public static void usingCollection() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        List<int[]> intArr = new ArrayList<>(Arrays.asList(arr1, arr2));

        Set<Integer> set = new HashSet<>();
        List<Integer> duplicateValues = new ArrayList<>();

        for (int[] arr : intArr) {
            for (int i : arr) {
                if (!set.add(i)) {
                    duplicateValues.add(i);
                } else {
                    set.add(i);
                }
            }
        }

        System.out.println(duplicateValues);
    }

    public static void usingForLoops() {
        int [] intArr = {10, 20, 30, 40, 50, 40, 50, 60, 70, 80};
        ArrayList<Integer> duplicateValues = new ArrayList<>();

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {

                if (intArr[i] == intArr[j]) {
                    duplicateValues.add(intArr[j]);
                }
            }
        }

        System.out.println("Duplicate Array Elements :" +duplicateValues);
    }

    public static void usingForLoopsNew() {
        int[] arr1 = {1, 2, 3, 6, 8, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                 if (arr1[i] == arr2[j]) {
                     System.out.println(arr1[i]);
                     break;
                 }
            }
        }
    }

    public static void main(String[] args) {
        usingCollection();
        usingForLoops();
        usingForLoopsNew();
    }
}
