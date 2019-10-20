package com.wxy.demo01;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class InterviewDay08 {
    public static void main(String[] args) {


        System.out.println("现在的话有点清楚了~");

//        创建多线程里面累加的对象:
        CyclicBarrier cyclicBarrier =new CyclicBarrier(7,()->{
//            匿名内部类使用了lanbda表达式:
            System.out.println("***********七颗龙珠一凑齐,召唤神龙~");

        });
//        其他线程执行:
        for (int i = 1; i <=7 ; i++) {
//            使用lanbda表达式创建,启动线程:
            final int number=i;
            new Thread(()->{
//                线程里面的逻辑:
                System.out.println(Thread.currentThread().getName()+"/t 收集到第"+number+"龙珠");

                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

            }).start();

        }
    }
}
