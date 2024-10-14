package org.tw.array;

import java.util.Scanner;

public class A8_GreatestCommonDivisor {

    public static int Division(int num1, int num2) {
        // Use the Euclidean algorithm to find the GCF
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:"); // 12
        int num1 = s.nextInt();
        System.out.println("Enter second number:"); // 18
        int num2 = s.nextInt();
        System.out.println(Division(num1, num2));
    }
}
