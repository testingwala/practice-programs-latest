package org.tw.miscellaneous;

public class M9_PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        int sum = 0, rem;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = (sum * 10) + rem;
        }

        if (temp == sum)
            System.out.println(temp + " Number is Palindrome");
        else
            System.out.println(temp + " Number is not a Palindrome");

    }
}
