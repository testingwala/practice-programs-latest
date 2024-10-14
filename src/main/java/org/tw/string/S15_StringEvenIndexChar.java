package org.tw.string;

public class S15_StringEvenIndexChar {

    // input : Automation
    // output: Atmto

    public static void main(String[] args) {
        String str = "Automation";

        StringBuilder evenIndexChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                evenIndexChars.append(str.charAt(i));
            }
        }

        System.out.println(evenIndexChars);
    }
}
