package org.tw.string;

public class S32_StringExtractNumberAfterDot {

    public static void main(String[] args) {
        double d = 1011.1511;
        String number = String.valueOf(d);
        System.out.println(number.substring(number.indexOf(".")+1));
    }
}
