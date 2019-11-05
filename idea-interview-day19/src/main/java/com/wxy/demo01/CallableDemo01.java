package com.wxy.demo01;

import java.util.concurrent.Callable;

public class CallableDemo01 {

    public static void main(String[] args) {

        myThread3 myThread3 = new myThread3();
        myThread3.start();
        System.out.println("+++++++++++++++++++++");
        myThread myThread = new myThread();
        Thread thread = new Thread(myThread);
        thread.start();
        System.out.println("通过接口的形式启动的话,首先通过接口实现接口,创建对象,在创建线程对象,对象里面需要添加 接口里面的创建对象作为参数");


    }

//参数里面可以传递接口,类里面可以实现多个接口
//    我知道这里面为什么需要传递接口了
//    可以这里面的的数据类型,就好比自己泛型一样里面包含了多个数据类型
//
}
class  myThread implements  Runnable{

    @Override
    public void run() {
        System.out.println("采用实现runnable的方式来实现多线程,实现接口的方式");
    }
}

class  myThread02 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("通过实现callable接口的方式实现多线程的方法");
//        该方法的好处:能够返回数据,作用就是方线程多线错误的时候就可以直到哪里出现问题了
//        还有就是可以抛出异常,用于排查问题
//        问题该如何使用在项目中该如何的使用这里
        return null;
    }
}

class  myThread3 extends  Thread{
    @Override
    public void run() {
        System.out.println("现在是继承了thread 的方式来实现多线程");
    }
}