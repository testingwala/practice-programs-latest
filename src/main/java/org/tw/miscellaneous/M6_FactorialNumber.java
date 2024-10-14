package org.tw.miscellaneous;

public class M6_FactorialNumber {

    private static void usingForLoop(int num, int fact) {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            // 1*1
            // 1*2
            // 2*3
            // 6*4
            // 24*5
        }
        System.out.println("Using for Loop: " + fact);
    }
    private static void usingWhile(int num, int fact) {
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("Using while loop: " + fact);
    }

    public static void main(String[] args) {
        int number = 5;
        int fact = 1;
        usingWhile(number, fact);
        usingForLoop(number, fact);
    }

}
