package com.wxy.demo01;

import java.util.TreeSet;

public class Thread01 {

    public static void main(String[] args) {


        long l = System.currentTimeMillis();

        for (int i = 0; i < 2000; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"执行业务");

            }).start();

        }
        long l1 = System.currentTimeMillis();
        System.out.println("完成上面操作的时间"+(l1-l));


    }
}
