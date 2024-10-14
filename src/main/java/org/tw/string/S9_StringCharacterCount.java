package org.tw.string;

public class S9_StringCharacterCount {

    private static void usingReplace() {
        String str = "Shriniwas".toLowerCase();

        String afterReplace = str.replace("i", "");
        System.out.println(str.length() - afterReplace.length());
    }

    private static void usingForLoop() {
        String str = "Shriniwas".toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') count++;
        }

        System.out.println(count);

    }

    private static void usingForEachLoop() {
        String str = "Shriniwas".toLowerCase();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        usingReplace();
        usingForLoop();
        usingForEachLoop();
    }
}
