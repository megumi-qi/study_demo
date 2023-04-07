package com.interview;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        /*List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(1,9);
        list.add(null);
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        Vector<Object> vector = new Vector<>();*/

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(7);
        linkedList.add(1,5);
        System.out.println(Arrays.toString(linkedList.toArray()));

        HashSet hashSet = new HashSet();
        hashSet.add("jack");
        hashSet.add("lucy");
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.remove(3);
        System.out.println(hashSet);

        int i=-16;//1 0000  0101
        System.out.println(i>>>2);


    }
}
