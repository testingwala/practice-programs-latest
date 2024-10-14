package org.tw.array;

import java.util.Arrays;

public class A7_ArrayAddition {

    public static boolean ArrayAddition(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1]; // Get the largest number
        int[] subsetArr = Arrays.copyOfRange(arr, 0, arr.length - 1); // Subset without largest

        // Check if any subset sums to the largest number
        return canSum(subsetArr, largest);
    }

    // Helper function to check if any subset sums up to the target
    public static boolean canSum(int[] arr, int target) {
        int totalSubsets = (1 << arr.length); // 2^n subsets

        // Loop through all subsets
        for (int i = 0; i < totalSubsets; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) != 0) {
                    sum = sum + arr[j];
                }
            }

            if (sum == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 7, 16, 1, 2}; // Should return false
        int[] arr2 = {3, 5, -1, 8, 12}; // Should return true

        System.out.println(ArrayAddition(arr1)); // Output: false
        System.out.println(ArrayAddition(arr2)); // Output: true
    }
}
