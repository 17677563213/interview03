package com.wxy.demo01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronouQueueTest01 {
    public static void main(String[] args) {
        BlockingQueue<String> stringBlockingQueue =new SynchronousQueue<>();

//        创建添加元素的线程:
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+"put 1");
                stringBlockingQueue.put("put 1");
                System.out.println(Thread.currentThread().getName()+"put 2");
                stringBlockingQueue.put("put 2");
                System.out.println(Thread.currentThread().getName()+"put 3");
                stringBlockingQueue.put("put 3");
                System.out.println(Thread.currentThread().getName()+"put 4");
                stringBlockingQueue.put("put 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"AA").start();


//        创建从同步队列里面获取到元素的线程:

        new Thread(()->{
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+ stringBlockingQueue.take());
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+ stringBlockingQueue.take());

                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+ stringBlockingQueue.take());
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+ stringBlockingQueue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            没有实际的使用啊,我还是不知道该怎么使用,他们的使用的场景,生产者,消费者模拟, 线程池,自己写一个线程池
//            不同的线程负责不同的
//他们之间的关系:
//            高并发怎么实现该效果,最原始,最高端,从这里面学习到的东西还是非常多的,juc, 模型,变形题目,一个线程添加,一个线程消费,
//            线程操作资源类
//            什么叫做虚假,什么
//            生产者,消费者
//            线程操作资源类是什么意思, 高内聚,低耦合,
//            交替操作,资源类,程序有关,这里面就会自己有这个方法,这里面的话,通过不同线程调用,
//            Java,就是通过对象来实现,类里面,原来这里面就是资源类
//            添加锁的对象
//            怎么添加锁,
//            通过创建对象,
//            多线程的工作,两个线程
//            为什么,这里面的不添加lock
//            怎么判断
//            这里面的资源类就好比,是一个类
//            就好比是一个空调
//            定义方法,这里面抛出异常,总的一场
//            怎么判断
//              一切及对象
//            使用的作用
//            多线程同一个资源类
//            怎么对资源类进行加锁
//            所谓的添加锁就是创建锁的对象
//            这里面就会有一个默认的方法
//
//
//

        },"BB").start();



    }
}
