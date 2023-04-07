package com.itheima.thread;

public class ThreadDemo {
    /**
     * 多线程的启动
     * 1.继承Thread类
     * 2.实现Runable接口
     * @param args
     */
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
