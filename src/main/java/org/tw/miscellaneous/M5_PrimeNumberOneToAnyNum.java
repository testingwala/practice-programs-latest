package org.tw.miscellaneous;

public class M5_PrimeNumberOneToAnyNum {

    public static void primeOneToN(int startNum, int endNum) {
        StringBuilder primeNum = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNum.append(i).append(" ");
            }
        }
        System.out.println("Prime Numbers between 1 to " + endNum + " are:");
        System.out.println(primeNum);
    }

    private static boolean isPrimeNumber(int number) {
        int temp = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                temp++;
            }
        }
        return temp == 2;
    }

    public static void main(String[] args) {
        primeOneToN(1, 100); // Prime Numbers between 1 to 100
        System.out.println(isPrimeNumber(5));
    }
}
