package org.tw.string;

import java.util.ArrayList;
import java.util.List;

public class S1_StringReverse {

    private static void usingCharAt(String str) {
        // Using charAt()
        String revString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revString += str.charAt(i);
        }

        System.out.println("Using charAt: " +revString);
    }

    private static void usingToCharArray(String str) {
        // Using toCharArray()
        char [] chArr = str.toCharArray();
        String revString = "";
        for (int i = chArr.length-1; i >= 0; i--) {
            revString += chArr[i];
        }

        System.out.println("Using toCharArray: " +revString);
    }

    private static void usingStringBuilderAndBuffer(String str) {
        StringBuilder strB = new StringBuilder(str);
        System.out.println("Using StringBuilder: " +strB.reverse());
    }

    private static void usingCollection(String str) {
        char [] chArr = str.toCharArray();

        List<Character> list = new ArrayList<>();

        for (char ch : chArr) {
            list.add(ch);
        }

        String revString = "";
        for (int i = list.size()-1; i >= 0 ; i--) {
            revString += list.get(i);
        }

        System.out.println("Using Collections: " +revString);
    }

    private static void usingWhileLoop(String str) {
        char [] chArr = str.toCharArray();

        int i = chArr.length - 1;
        String revString = "";

        while (i >= 0) {
            revString += chArr[i];
            i--;
        }

        System.out.println("Using While Loop: " +revString);
    }

    private static void usingSubstring(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            revString += str.substring(i, i+1);
        }

        System.out.println("Using subString:" +revString);
    }

    public static void main(String[] args) {
        usingCharAt("Shriniwas");

        System.out.println("---------------------------");

        usingToCharArray("Shriniwas");

        System.out.println("---------------------------");

        usingStringBuilderAndBuffer("Shriniwas");

        System.out.println("---------------------------");

        usingCollection("Shriniwas");

        System.out.println("---------------------------");

        usingWhileLoop("Shriniwas");

        System.out.println("---------------------------");

        usingSubstring("Shriniwas");
    }
}
