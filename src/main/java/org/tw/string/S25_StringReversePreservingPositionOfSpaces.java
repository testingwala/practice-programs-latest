package org.tw.string;

public class S25_StringReversePreservingPositionOfSpaces {

    public static void main(String[] args) {
        String input = "Hello Welcome Shriniwas";
        String [] splitStr = input.split(" ");

        StringBuilder sb = new StringBuilder(input.replaceAll(" ", ""));
        String revString = sb.reverse().toString();
        StringBuilder finalString = new StringBuilder();

        int startIndex = 0;
        for (int i = 0; i <= splitStr.length - 1; i++) {
            int endIndex = startIndex + splitStr[i].length();
            String str = revString.substring(startIndex, endIndex);
            startIndex = endIndex;
            finalString.append(str).append(" ");
        }
        System.out.println(finalString.toString().trim());
    }
}
