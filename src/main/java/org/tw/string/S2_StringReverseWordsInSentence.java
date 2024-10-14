package org.tw.string;

public class S2_StringReverseWordsInSentence {

    private static void usingWhileLoop() {
        String str = "Hi, Shriniwas Alle";

        String [] strArr = str.split("\\s+");

        int i = strArr.length - 1;

        while (i >= 0) {
            System.out.println(strArr[i]);
            i--;
        }
    }

    public static void usingArray() {
        String str = "Hi, Shriniwas Alle";
        String [] strArr = str.split("\\s+");

        String revString = "";
        for (int i = strArr.length - 1; i >=0 ; i--) {
            revString += strArr[i] + " ";
        }

        System.out.println(revString.trim());
    }

    public static void main(String[] args) {
        System.out.println("----- Using while loop ----");
        usingWhileLoop();
        System.out.println("----- Using Array ----");
        usingArray();
    }
}
