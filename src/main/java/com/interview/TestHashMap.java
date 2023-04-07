package com.interview;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
//        hashMap.put("first","刻晴");
//        hashMap.put("second","胡桃");
//        hashMap.put("third","莫娜");
//        hashMap.put("fourth","温蒂");
        for (int i = 0; i < 12; i++) {
            hashMap.put(new A(i),"aaa");
        }
        /*for (int i = 0; i < 100000; i++) {
            hashMap.put(i,"刻晴");
        }
        //遍历
        //(1)增强for
        for (Object key :hashMap.keySet()) {
            System.out.println(key+"->"+hashMap.get(key));
        }
        Long endTime=System.currentTimeMillis();
        System.out.println("共花费:"+(endTime-startTime)+"ms");

        Collection values=hashMap.values();
        for (Object value :values) {
            System.out.println("key.values="+value);
        }
        //(2)迭代器
        Iterator iterator=values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //通过EntrySet获取
        //（1）增强for
        Set entrySet=hashMap.entrySet();
        for (Object entry :entrySet) {
            Map.Entry m= (Map.Entry) entry;
            System.out.println(m);
        }
        //(2)迭代器
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }*/

    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}