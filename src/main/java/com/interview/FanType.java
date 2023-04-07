package com.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class FanType {

    public static void main(String[] args) {
        Animal animal=new Animal();
        ArrayList<Object> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        animal.sing(list,"list1");
    }
}
class Animal<K,V>{
    public <R,T> void sing(R r, T t){
        System.out.println(r.getClass());
        System.out.println(t.getClass());
    }
    public <K,T> void song(K k, T t){
        System.out.println(k.getClass());
        System.out.println(t.getClass());
    }

}
