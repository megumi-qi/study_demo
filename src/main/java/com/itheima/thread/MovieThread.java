package com.itheima.thread;

public class MovieThread extends Thread{

    static int num=0;
    static Object obj=new Object();//锁对象要唯一
    @Override
    public void run() {
        while (true) {
            synchronized (obj){//锁对象

                if (num<100){
                    num++;
                    System.out.println(getName()+"出售了第"+num+"张电影票");
                    /*try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }else {
                    break;
                }
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        MovieThread t1=new MovieThread();
        MovieThread t2=new MovieThread();
        MovieThread t3=new MovieThread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
