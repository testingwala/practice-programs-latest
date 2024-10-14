package org.tw.miscellaneous;

public class M10_SwapWithoutThirdVariable {

    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Before Swapping:" +" a=" + a + " " + " b=" + b);
        a = a + b; // 5
        b = a - b; // b = 5-3 = 3
        a = a - b; // a = 5-3 = 2
        System.out.println("After Swapping:" +" a=" + a + " " + " b=" + b);
    }
}
