package com.interview;

import java.util.Arrays;
import java.util.Comparator;

public class TestArray {
    public static void main(String[] args) {
        Integer[] a={123,-23,76,344,667};
        Arrays.sort(a);
        //自然排序
        System.out.println(Arrays.toString(a));
        //定制排序
        Arrays.sort(a,new Comparator(){

            @Override
            public int compare(Object o1,Object o2) {
                Integer i1= (Integer) o1;
                Integer i2= (Integer) o2;
                return i2-i1;//i1-i2从小到大 i2-i1从大到小
            }
        });
        System.out.println(Arrays.toString(a));
    }
}
