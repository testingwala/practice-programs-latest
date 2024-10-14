package org.tw.string;

public class S5_StringPalindrome {

    private static void usingStringBuilder() {
        String input = "aba";

        StringBuilder stringBuilder = new StringBuilder(input);
        String revString = stringBuilder.reverse().toString();

        if (revString.equals(input)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }

    private static void usingForLoop() {
        String original="aba";
        String reverse = "";
        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String isn't a palindrome.");

    }

    private static boolean usingTwoPointers() {
        String str = "madam";

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        usingStringBuilder();
        usingForLoop();
        System.out.println(usingTwoPointers());
    }
}
