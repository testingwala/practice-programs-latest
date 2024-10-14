package org.tw.array;

import java.util.Arrays;
/*
    Input  : {1, 2, 3, 4, 5}
    Output : {5, 4, 3, 2, 1}
*/
public class A4_ArrayReverse {

    // We used two 'pointers' concept here. One pointer will start from the beginning
    // and another one from the back, and will swap their values
    private static void usingTwoPointers() {
        int[] inputArr = new int[] {1, 2, 3, 4, 5};

        int start = 0;
        int end   = inputArr.length - 1;

        while (start < end) {
            int temp = inputArr[start];
            inputArr[start] = inputArr[end];
            inputArr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(inputArr));
    }

    public static void main(String[] args) {
        usingTwoPointers();
    }
}
