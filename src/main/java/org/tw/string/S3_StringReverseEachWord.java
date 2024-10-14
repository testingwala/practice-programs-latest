package org.tw.string;

public class S3_StringReverseEachWord {

    private static void reverseEachWord() {
        String str = "Hello My Name is Shriniwas";

        String [] strArr = str.split("\\s+");

        StringBuilder revStr = new StringBuilder();

        for (String word : strArr) {

            for (int i = word.length() - 1; i >= 0; i--) {
                revStr.append(word.charAt(i));
            }
            revStr.append(" ");
        }
        System.out.println(revStr);
    }

    public static void main(String[] args) {
        reverseEachWord();
    }
}
