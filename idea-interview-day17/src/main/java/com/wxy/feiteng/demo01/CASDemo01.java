package com.wxy.feiteng.demo01;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo01 {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        boolean b = atomicInteger.compareAndSet(1, 100);
//       还是非常的不知仔细:
//        创建对象,atomicInteger,这里面的累加,在多线程里面是不安全的,
//        这里面的方案,第一种就是对累加的方法进行添加所的操作,
//        但是这样的方法是不好的,因为这样的话,因为牺牲了并发下面的效率,换取安全
//        第二种就是通过创建atomicInteger()的对象,通过该对象调用比较并交换
//        这里面是就是CAS底层的原理
        System.out.println("模拟线程执行");
        Thread.sleep(1000);
        System.out.println(atomicInteger.get()+"获取到的数据");
//        底层的原理,就可以说说这里面的思路:
//        问题,这里面的话如果不一样该怎么办,
//        底层原理
//        就是这里面的思路:
//        直到该怎么使用
//        底层原理
//
    }



}
