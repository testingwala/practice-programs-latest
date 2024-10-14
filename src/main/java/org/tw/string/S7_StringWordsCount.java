package org.tw.string;

public class S7_StringWordsCount {

    private static void usingSplitMethod() {
        String str = "I am an Automation Engineer";

        String[] strArr = str.split("\\s+");

        System.out.println("Count of words :: " + strArr.length);
    }

    private static void usingForLoop() {
        String str = "I am an Automation Engineer";

        int count = 0;
        boolean flag = false;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) != ' ') {
                if (!flag) {
                    count++;
                    flag = true;
                }
            } else {
                flag = false;
            }
        }

        System.out.println("Count of words :: " + count);
    }

    public static void usingForLoopSimple() {
        String str = "I am an Automation Engineer";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("Count of words :: " +count);
    }

    public static void main(String[] args) {
        usingSplitMethod();
        usingForLoop();
        usingForLoopSimple();
    }
}
