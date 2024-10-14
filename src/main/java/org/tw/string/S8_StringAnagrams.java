package org.tw.string;

import java.util.Arrays;

public class S8_StringAnagrams {

    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";
        boolean flag;

        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            char[] chArr1 = str1.toCharArray();
            char[] chArr2 = str2.toCharArray();

            Arrays.sort(chArr1);
            Arrays.sort(chArr2);

            flag = Arrays.equals(chArr1, chArr1);
        }
        if (flag) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
