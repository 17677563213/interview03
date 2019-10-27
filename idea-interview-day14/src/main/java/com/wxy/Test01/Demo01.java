package com.wxy.Test01;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo01 {

    public static void main(String[] args) {
//        原子性:这里面演示的问题就是i++在多线程下面出现的问题
        AtomicInteger atomicInteger =new AtomicInteger(4);
//        需要自己设置内容

        System.out.println(atomicInteger.compareAndSet(4, 100)+"  获取到的数据 : "+atomicInteger.get());
//        如果一致的话,就会出现


    }



}
