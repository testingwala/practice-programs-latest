package org.tw.array;

import java.util.Arrays;
import java.util.Collections;

/*
* {4, 781, 8, 99, 103} : 2nd Max -> 103
* {4, 781, 8, 99, 103} : 2nd Min -> 8
* */

public class A5_ArrayFindSecondMaxMin {

    private static void secondMaxUsingArraysSortMethod() {
        int [] intArr = new int[] {4, 781, 8, 99, 103};
        Integer [] integerArr = new Integer[intArr.length];

        for (int i = 0; i < intArr.length; i++) {
            integerArr[i] = intArr[i];
        }

        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArr));
        System.out.println(integerArr[1]);
    }

    private static void secondMinUsingArraysSortMethod() {
        int [] intArr = new int[] {4, 781, 8, 99, 103};
        int [] integerArr = new int[intArr.length];

        for (int i = 0; i < intArr.length; i++) {
            integerArr[i] = intArr[i];
        }

        Arrays.sort(integerArr);
        System.out.println(Arrays.toString(integerArr));
        System.out.println(integerArr[1]);
    }

    public static void main(String[] args) {
        secondMaxUsingArraysSortMethod();
        secondMinUsingArraysSortMethod();
    }
}
