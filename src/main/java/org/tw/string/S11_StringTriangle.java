package org.tw.string;

public class S11_StringTriangle {

    private static void usingSubstringMethod() {
        String str = "Shriniwas";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }

    private static void usingTwoForLoops() {
        String str = "Shriniwas";

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        usingSubstringMethod();
        usingTwoForLoops();
    }
}
