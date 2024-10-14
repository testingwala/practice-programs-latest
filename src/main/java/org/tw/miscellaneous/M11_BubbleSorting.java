package org.tw.miscellaneous;

public class M11_BubbleSorting {

    private static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        bubbleSort(arr);// sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
