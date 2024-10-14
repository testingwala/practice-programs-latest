package org.tw.string;

/*
* Input: Shriniwas Alle
* Output: ellAsawin irhS
*
* Please check S25 program, same problem statement with diff logic
* */
public class S22_StringReversePreservingLength {

    public static void main(String[] args) {
        String str = "Shriniwas Alle";

        String[] strSplit = str.split(" ");

        String withoutSpaces = str.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(withoutSpaces);
        String reversedString = stringBuilder.reverse().toString();
        // e=0, l=1, l=2, A=3, s=4, a=5, w=6, i=7, n=8, i=9, r=10, h=11, S=12

        StringBuilder finalString = new StringBuilder();

        int index = 0;
        // 0, 10-1 = 0, 8
        // 8, 4+9
        for (int i = 0; i <= strSplit.length-1; i++) {
            String appendedString = finalString
                    .append(reversedString.substring(index, strSplit[i].length()+index))
                    .append(" ")
                    .toString();
            index = appendedString.length()-1;
        }
        System.out.println(finalString);
    }
}
