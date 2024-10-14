package org.tw.string;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class S23_StringFirstOccurrenceCapital {

    public static void main(String[] args) {
        String input = "acacnaNghjkK".toLowerCase();
        char[] chArr = input.toCharArray();

        List<Character> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        for (char c : chArr) {
            if (list.contains(c)) {
                output.append(c);
            } else {
                output.append(Character.toUpperCase(c));
                list.add(c);
            }
        }

        System.out.println("Input:" +input);
        System.out.println("Output:" +output);
    }
}
