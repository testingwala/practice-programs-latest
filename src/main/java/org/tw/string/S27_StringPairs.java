package org.tw.string;

/*
 * Input: "abcd"
 * Output: ab ac ad bc bd cd
 * */

public class S27_StringPairs {


    private static void usingForLoops() {
        String str = "abcd";

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(i);

            for (int j = 1; j < newStr.length(); j++) {
                System.out.print(newStr.charAt(0) +""+ newStr.charAt(j) + " ");
            }
        }
    }

    private static void usingWhileLoops() {
        String str = "abcd";

        int i = 0;
        while(i < str.length()) {
            String newStr = str.substring(i);

            int j = 1;
            while (j < newStr.length()) {
                System.out.print(newStr.charAt(0) +""+ newStr.charAt(j) + " ");
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        usingForLoops();
        System.out.println();
        usingWhileLoops();
    }
}
