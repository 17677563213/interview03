package com.wxy.demo01;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABADemo01 {
    public static  AtomicReference atomicReference =new AtomicReference(100);
    public static AtomicStampedReference atomicStampedReference =new AtomicStampedReference(100,1);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("下面演示ABA的问题");
        new Thread(()->{

        atomicReference.compareAndSet(100,101);
        atomicReference.compareAndSet(101,100);

        },"线程一").start();
        new Thread(()->{
            try {
                Thread.sleep(1);
                System.out.println("是否能够替换的结果"+atomicReference.compareAndSet(100, 2019)+"\t最后面的结果"+atomicReference.get());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"线程二").start();
        Thread.sleep(2);

        System.out.println("下面是处理ABA的问题方法");
        new Thread(()->{
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"版本号"+stamp);
            try {
                Thread.sleep(1);
                atomicStampedReference.compareAndSet(100,102,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
                System.out.println("线程三的版本号"+atomicStampedReference.getStamp());
                atomicStampedReference.compareAndSet(102,100,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
                System.out.println("线程三的版本号"+atomicStampedReference.getStamp());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        },"线程三").start();


        new Thread(()->{

            int stamp = atomicStampedReference.getStamp();
            System.out.println("线程四的版本的编号"+stamp);
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(atomicStampedReference.compareAndSet(100, 2019, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1)+"" +
                    "t"+atomicStampedReference.getReference());

            System.out.println("最后面结果的版本号"+atomicStampedReference.getStamp());
        },"线程四").start();





    }
}
