package org.tw.string;

public class S16_StringRemoveSpaces {

    private static void usingCharAt() {
        String str = "Welcome to Automation";

        StringBuilder stB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stB.append(str.charAt(i));
            }
        }

        System.out.println("String without Spaces:: " +stB);
    }

    private static void usingList() {
        String str = "Welcome to Automation";
        String [] strArr = str.split("\\s+");

        StringBuilder stB = new StringBuilder();

        for (String st : strArr) {
            stB.append(st);
        }

        System.out.println("String without Spaces:: " +stB);
    }

    public static void main(String[] args) {
        usingCharAt();
        usingList();
    }
}
