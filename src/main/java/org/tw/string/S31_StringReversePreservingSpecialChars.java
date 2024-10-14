package org.tw.string;

public class S31_StringReversePreservingSpecialChars {

    public static void main(String[] args) {
        String input = "A#B%C";

        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (!Character.isLetter(chars[left])) {
                left++;
            }

            else if (!Character.isLetter(chars[right])) {
                right--;
            }
            // If both chars[left] and chars[right] are letters, swap them
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(chars));
    }

}
