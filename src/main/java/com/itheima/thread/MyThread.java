package com.itheima.thread;

public class MyThread implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName+":111");
        }
    }
    /*public static String aaa="111";
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            String threadName=super.getName();
            System.out.println(threadName+":"+aaa);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }*/
}
