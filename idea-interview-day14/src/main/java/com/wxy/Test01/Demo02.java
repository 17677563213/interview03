package com.wxy.Test01;

import java.util.concurrent.CountDownLatch;

public class Demo02 {
    public static void main(String[] args) {
//        原来在创建对象的额时候就要明确
//        这里面的要从什么数字开始递减了
//        问题是使用的场景
//        怎么使用
//        在线程里面调用对象调用方法 countDownd
//        子线程没执行一次的话就会递减
//        在外面进行拦截
//        如果不添加的话,就会先执行main()
        CountDownLatch countDownLatch = new CountDownLatch(10);



    }




}
