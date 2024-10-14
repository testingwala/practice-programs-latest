package org.tw.array;

public class A2_FindLargestAndSmallestInArray {

    private static void usingForLoop() {
        int [] intArr = {10, 20, 300, 40, 50, 40, 50, 60, 70, 5};

        int max = intArr[0];
        int min = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            } else if(min > intArr[i]) {
                min = intArr[i];
            }
        }

        System.out.println("Largest Number: " +max);
        System.out.println("Smallest Number: " +min);
    }

    private static void usingForEachLoop() {
        int [] intArr = {10, 20, 300, 40, 50, 40, 50, 60, 70, 5};

        int max = intArr[0];
        int min = intArr[0];

        for (int num : intArr) {
            if (max < num) {
                max = num;
            } else if(min > num) {
                min = num;
            }
        }

        System.out.println("Max Number: " +max);
        System.out.println("Min Number: " +min);
    }

    public static void main(String[] args) {
        usingForLoop();
        usingForEachLoop();
    }
}
