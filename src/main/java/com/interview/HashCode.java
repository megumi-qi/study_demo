package com.interview;

import java.util.Objects;

/**
 * 重写equals一般要重写hashcode方法
 * hashcode主要提高数据的插入效率减少调用equals方法的频率
 * 例如hashmap、hashtable中存入元素先去查询有这个元素的hashcode值没有就直接存入，
 * 存在就调用equals方法比较，相同就直接覆盖，不相同就散入到其他地址，一般用链表或者线性探测解决
 * 如果重写equals不重写hashcode方法就会存在对象相等hashcode不同的情况
 */
public class HashCode {
    String name;
    int age;

    public HashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode hashCode = (HashCode) o;
        return age == hashCode.age &&
                Objects.equals(name, hashCode.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    public static void main(String[] args) {
        HashCode fatherHash1 = new HashCode("张三",19);
        HashCode fatherHash2 = new HashCode("张三",19);
        System.out.println(fatherHash1.equals(fatherHash2));
        System.out.println("fatherHash1.hashcode="+fatherHash1.hashCode());
        System.out.println("fatherHash2.hashcode="+fatherHash2.hashCode());
    }
}
