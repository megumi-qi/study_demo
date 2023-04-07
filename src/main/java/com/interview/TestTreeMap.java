package com.interview;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String)o2).compareTo((String)o1);//根据key进行排序
                return ((String)o2).length()-((String)o1).length();//根据value进行排序
            }
        });
        treeMap.put("ccc1","刻晴");
        treeMap.put("bbb","摩拉克斯");
        treeMap.put("aaaaa","天枢星");
        treeMap.put("zz","安静地刷进度计划");
        System.out.println(treeMap);
    }
}
