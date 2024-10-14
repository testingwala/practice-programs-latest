package org.tw.string;

public class S17_StringPrintCharTwice {

    // input : hello
    // output: hheelllloo

    public static void main(String[] args) {
        String str = "hello";

        StringBuilder stB = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stB.append(ch).append(ch);
        }

        System.out.println(stB);
    }
}
