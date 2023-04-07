package com.itheima.lamda;

public class TestLamda implements Lamda {



    public static void main(String[] args) {
        Lamda lamda=null;
        lamda=(a,b)->{
            System.out.println("adasdsd"+(a+b));
        };
        lamda.test(222,333);
    }

    @Override
    public void test(int a, int b) {

    }
}
