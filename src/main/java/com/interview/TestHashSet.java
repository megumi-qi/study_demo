package com.interview;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.add(new String("aaa"));
//        hashSet.add(new String("aaa"));

        hashSet.add(new Person("张三",33));
        hashSet.add(new Person("张三",33));
        hashSet.add(new Person("张三",34));
        System.out.println(hashSet);

        Map hashMap = new HashMap();
        hashMap.put(1,new Person("张三",33));
        hashMap.put(2,new Person("张三",33));
        hashMap.put(3,new Person("张三",33));
        //
        Collection values=hashMap.values();
        for (Object value :values) {
            System.out.println(value);
        }

        System.out.println("hashMap.values()="+hashMap.values());

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add("aaa");
        System.out.println(linkedHashSet);

    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
