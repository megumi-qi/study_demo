package com.itheima.thread;

import org.apache.poi.ss.formula.functions.T;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        int num=0;
        for (int i = 0; i <= 100; i++) {
            num+=i;
        }
        return num;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 1.创建一个类实现Callable接口
         * 2.重写call（有返回值，表示多线程的执行结果）
         * 3.创建MyCallable的对象（表示多线程要执行的任务）
         * 4.创建FutureTask的对象（作用管理多线程的结果）
         * 5.创建Thread的对象并启动（表示线程）
         */
        MyCallable callable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask(callable);
        Thread t1=new Thread(futureTask);
        t1.start();
        Integer res=futureTask.get();
        System.out.println(res);
    }
}
