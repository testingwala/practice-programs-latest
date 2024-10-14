package org.tw.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class S10_StringUniqueCharacters {

    public static void main(String[] args) {
        String str = "good looking";

        // To Preserve the Order
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                set.add(ch);
            }
        }

        // String finalString = set.stream().map(String :: valueOf).collect(Collectors.joining());

        StringBuilder stb = new StringBuilder();

        for (char ch : set) {
            stb.append(ch);
        }

        System.out.println(stb);
    }
}
