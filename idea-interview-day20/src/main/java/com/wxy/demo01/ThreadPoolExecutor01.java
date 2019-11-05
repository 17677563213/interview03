package com.wxy.demo01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor01 {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor =new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                new ThreadPoolExecutor.AbortPolicy()
                );


        try {
            for (int i = 0; i <9; i++) {

            threadPoolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"执行业务");

            });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPoolExecutor.shutdown();
        }


    }





}
