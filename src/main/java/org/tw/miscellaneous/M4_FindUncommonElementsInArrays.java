package org.tw.miscellaneous;

import java.util.*;

public class M4_FindUncommonElementsInArrays {

    /*
    list1 = {1,2,3,11} and list2 = {11,33,3,4}
    Output : [1, 2, 33, 4]
    */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("11");
        List<String> temp = new ArrayList<>(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("11");
        list2.add("33");
        list2.add("3");
        list2.add("4");

        list1.removeAll(list2);
        list2.removeAll(temp);

        temp.clear();

        temp.addAll(list1);
        temp.addAll(list2);
        System.out.println("Uncommon Elements in List: " + temp);
    }
}
