package com.interview;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });
        treeSet.add("sjh");
        treeSet.add("ad");
        treeSet.add("ewe");

        System.out.println(treeSet);
    }
}
