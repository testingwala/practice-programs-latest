package org.tw.string;

public class S24_StringNumbersSum {

    private static void usingIntegerParseInt() {
        String str = "Shri123Was";
        String digits = str.replaceAll("\\D+", "");
        int sum = 0;

        for (String str1: digits.split("")) {
            sum = sum + Integer.parseInt(str1);
        }

        System.out.println(sum);
    }

    private static void usingWhileLoop() {
        String str = "Shri123Was";
        String digits = str.replaceAll("\\D+", "");
        int sum = 0;
        int number = Integer.parseInt(digits);
        int rem;

        while(number > 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number/10;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        usingIntegerParseInt();
        usingWhileLoop();
    }
}
