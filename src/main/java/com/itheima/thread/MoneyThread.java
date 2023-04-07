package com.itheima.thread;

import java.security.SecureRandom;
import java.time.chrono.MinguoChronology;
import java.util.Random;

public class MoneyThread extends Thread {
    static int count=3;
    static int money=100;
    static double MIN=0.01;
    static double MAX=99.98;
    double prize=0;
    @Override
    public void run() {
        synchronized (Thread.class){
            if (count==0){
                System.out.println("红包已抢完"+getName()+"未抢到");
            }else {
                if (count==1){
                    prize=money;
                }else {
                    SecureRandom random = new SecureRandom();
                    //double bounds=money-(count-1)*MIN;
                    prize = MIN + money * random.nextDouble();
                    if (prize > MAX) {
                        prize = MAX;
                    }
                }
                    money-=prize;
                    System.out.println(getName()+"抢到"+prize+"元");
                    count--;
            }
        }
    }
}
