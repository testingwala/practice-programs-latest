package org.tw.string;

/* A Pangram is a sentence containing every letter in the English Alphabet.

Input: “The quick brown fox jumps over the lazy dog”
Output: is a Pangram
Explanation: Contains all the characters from ‘a’ to ‘z’]

Input: “The quick brown fox jumps over the dog”
Output: is not a Pangram
Explanation: Doesn’t contain all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing
*/

public class S30_StringPangramCheck {

    public static boolean isPangram(String input) {

        boolean[] mark = new boolean[26];

        int index = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (!mark[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isInputPangram = isPangram("The quick brown fox jumps over the lazy dog");

        if (isInputPangram)
            System.out.print("Input is a pangram");
        else
            System.out.print("Input is a not pangram");
    }
}
