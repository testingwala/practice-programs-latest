package org.tw.string;

public class S18_StringSwapWithoutThirdVar {

    public static void main(String[] args) {
        String str1 = "Shriniwas";
        String str2 = "Alle";

        str1 = str1 + str2;

        str2 = str1.substring(0, (str1.length() - str2.length())); // (0, (13-4)) = Shriniwas
        str1 = str1.substring(str2.length()); // .substring(9); Alle

        System.out.println("Stri1 = " +str1);
        System.out.println("Stri2 = " +str2);
    }
}
