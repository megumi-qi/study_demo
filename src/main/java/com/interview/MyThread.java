package com.interview;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {
        ThreadT thread1 = new ThreadT();
        ThreadT thread2 = new ThreadT();
        thread1.start();
        thread2.start();
    }
}
class ThreadT extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        //Thread.yield();
        System.out.println(Thread.currentThread().getName()+"执行完毕");
    }
}
