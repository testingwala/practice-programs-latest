package org.tw.miscellaneous;

public class M8_ReverseNumber {

    public static void main(String[] args) {
        // Input 1234, Output 4321
        int number = 1234;
        int rev = 0;
        while (number > 0) {
            rev = rev * 10;
            rev = rev + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse number is : " + rev);
    }

}
