package org.tw.array;

import java.util.Arrays;

public class A6_ArraySumOfTwo {

    public static void main(String[] args) {
        int [] intArr = new int[] { 1, 2, 3, 5 };
        int [] sumNumbers = new int[2];
        int num = 5;

        for (int i : intArr) {
            for (int k : intArr) {
                if (i + k == num) {
                    sumNumbers[0] = k;
                    sumNumbers[1] = i;
                }
            }
        }

        System.out.println(Arrays.toString(sumNumbers));
    }
}
