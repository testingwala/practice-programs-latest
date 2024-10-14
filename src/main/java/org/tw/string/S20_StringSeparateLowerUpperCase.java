package org.tw.string;

import java.util.Arrays;

public class S20_StringSeparateLowerUpperCase {

    public static void main(String[] args) {
        String str = "aBACbcEDed";

        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            }
            if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            }
        }

        Arrays.sort(upperCase.toString().toCharArray());
        Arrays.sort(lowerCase.toString().toCharArray());

        System.out.println("Uppercase: " +upperCase);
        System.out.println("Lowercase: " +lowerCase);
    }
}
