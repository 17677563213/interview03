package com.wxy.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool01 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        long l = System.currentTimeMillis();
        try {
            for (int i = 0; i <2000 ; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"办理业务");


                });
            }
            long l1 = System.currentTimeMillis();
            System.out.println("执行的时间++++++++++++++++++++++"+(l1-l));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }


    }
}
