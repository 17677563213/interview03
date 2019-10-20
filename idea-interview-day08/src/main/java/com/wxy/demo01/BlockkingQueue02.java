package com.wxy.demo01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockkingQueue02 {

    public static void main(String[] args) {
        BlockingQueue blockingQueue =new ArrayBlockingQueue(2);

//        之前的方法:add() :添加元素:
//        remove():移除元素,有两种方法,第一种就是编写填写参数,就是按照队列的先进先出的原则,第二种就是按照指定的元素移除
//        上面的两个方法,都是比较暴力的,如果添加的元素的个数超过了,容器的空间,就会报错
//        移除元素时候,如果没有了还在移除,也会报错,

//        现在使用的一种比比较温柔的方式put()也是添加元素:
//
//
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));

        System.out.println("------移除元素-----------");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
//        这里面删除掉的元素是什么,如果没有的话,就会获取到为null的数据
        System.out.println("检查元素peek()");
        System.out.println(blockingQueue.peek());


    }
}
