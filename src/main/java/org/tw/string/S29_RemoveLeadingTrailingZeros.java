package org.tw.string;

public class S29_RemoveLeadingTrailingZeros {
    public static void main(String[] args) {
        String input = "0012345678900";

        int startZerosCount = 0;

        while (startZerosCount < input.length() && input.charAt(startZerosCount) == '0') {
            startZerosCount++;
        }

        input = input.substring(startZerosCount);

        int endZeroesCount = input.length() - 1;

        while (endZeroesCount > 0 && input.charAt(endZeroesCount) == '0') {
            endZeroesCount--;
        }

        System.out.println(input.substring(0, endZeroesCount + 1));
    }
}
