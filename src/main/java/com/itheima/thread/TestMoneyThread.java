package com.itheima.thread;

import java.sql.Array;
import java.util.*;

public class TestMoneyThread extends Thread{
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        /*MoneyThread t1=new MoneyThread();
        MoneyThread t2=new MoneyThread();
        MoneyThread t3=new MoneyThread();
        MoneyThread t4=new MoneyThread();
        MoneyThread t5=new MoneyThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();*/
        //数组扩容
        /*int[] a={1,2,3};
        int[] b=new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        b[b.length-1]=4;
        a=b;
        System.out.println(Arrays.toString(a));*/
        //冒泡排序
        /*int[] a={32,783,232,45,1212,463};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                int temp=a[j];
                if (a[j]>a[j+1]){
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.println("冒泡排序后第"+(i+1)+"的数组:"+Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));*/

        //二维数组
        //int a[][] =new int[2][];
        //杨辉三角
        /*int a[][]=new int[10][];
        for (int i = 0; i < a.length; i++) {
            a[i]=new int[i+1];
            for (int j = 0; j < a[i].length; j++) {
                if (j==0||j==a[i].length-1){
                    a[i][j]=1;
                }else {
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }*/
        //汉若塔
        /*Tower tower = new Tower();
        tower.move(5,'A','B','C');*/

        //单例模式
        /*Dog dog = Dog.getInstance();
        System.out.println(dog);*/

        //匿名内部类
        CellPhone cellPhone = new CellPhone();
        cellPhone.PhoneRing(new Bell() {
            @Override
            public void ring() {
                System.out.println("aaaa");
            }
        });
    }
}
class Tower{
    public void move(int num,char a,char b,char c){
        if (num==1){
            System.out.println(a+"->"+c);
        }else {
            move(num-1,a,c,b);
            System.out.println(a+"->"+c);
            move(num-1,b,a,c);
        }
    }
}

class Dog{
    private String name;
    private static Dog dog=new Dog("aa");

    private Dog(String name) {
        System.out.println("aaa");
        this.name = name;
    }
    public static Dog getInstance(){
        if (dog==null){
            System.out.println("111");
        }
        return dog;
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void PhoneRing(Bell bell){
        bell.ring();
    }
}
