package com.interview.SynchronizedAndLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VoilteLock {
    public static void main(String[] args) {
        TestLock1 testLock1 = new TestLock1();
        new Thread(()->testLock1.run()){}.start();
        new Thread(()->testLock1.run()){}.start();
    }
}
class TestLock1 implements Runnable {

    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+":得到了锁");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+":释放到了锁");
        }
    }
}