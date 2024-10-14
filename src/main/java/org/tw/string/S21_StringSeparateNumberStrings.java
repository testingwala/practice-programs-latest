package org.tw.string;

public class S21_StringSeparateNumberStrings {

    private static void usingInbuiltMethods() {
        String str = "Shri123niwas";

        StringBuilder digits = new StringBuilder();
        StringBuilder strings = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
            if (Character.isAlphabetic(ch)) {
                strings.append(ch);
            }
        }

        System.out.println("Digits : " +digits);
        System.out.println("Strings : " +strings);
    }

    private static void usingRegex() {
        String str = "Shri123niwas";

        String digits = str.replaceAll("\\D+", "");
        String strings = str.replaceAll("\\d+", "");

        System.out.println("Digits : " +digits);
        System.out.println("Strings : " +strings);
    }

    public static void main(String[] args) {
        usingInbuiltMethods();

        System.out.println("-----------------");

        usingRegex();
    }
}
