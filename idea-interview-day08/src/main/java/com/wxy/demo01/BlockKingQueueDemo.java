package com.wxy.demo01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockKingQueueDemo {
    public static void main(String[] args) {
//        创建线程堵塞队列 ,底层是数组,跟ArrayList 一样,不同的地方就是,这里面的话,是有界的,就是有大些小规定
//        模拟场景:去餐厅吃饭,保证了都能够执行
        BlockingQueue blockingQueue =new ArrayBlockingQueue(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("d"));


//        顶点清除,这里面遇到的问题就是,为什么不报错?
//        我知道了原来,这里面没有指定的话,就会
//        脾气火爆:
//        element:元素的意思,获取到里面的全部元素:作用就是检查是否为空,第一个元素是谁
//
        System.out.println("元素的检查");
        System.out.println(blockingQueue.element());
//        添加不了的话,该如何处理
//        温柔版
//        超出原来的空间,这里面就不会进行扩容
//        温柔的态度
//        成功的话就会true
//        不成功的话就是false
//        peek():作用:看最前面的元素是什么,
//        poll():获取元素,能够取的话就获取,不能够的话就是null ,不会报错
//        什么意思?
//        put:
//        消息积压,
//
//      一直在这里面耗着

//  有什么用,使用的场景,这里面没有明确个数,在同一个线程里面
//        不消费掉,线程模拟,添加,不存储对数据,第一个行清除掉了,后面才会去拿
//        线程的名称,put() take()获取,同步队列?





    }
}
