package com.interview.SynchronizedAndLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

    private Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        TestLock testLock = new TestLock();
        new Thread(()->testLock.test()){}.start();
        new Thread(()->testLock.test()){}.start();
    }
    public void test(){
        List list = new ArrayList();
        //lock.lock();
        if (lock.tryLock()) {
            try {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(Thread.currentThread().getName()+"得到了锁");
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName()+"释放了锁");
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"获取锁失败");
//            System.out.println(thread.getName()+":"+lock.tryLock());
        }
    }
}
