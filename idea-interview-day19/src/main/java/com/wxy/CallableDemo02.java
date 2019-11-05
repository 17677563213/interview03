package com.wxy;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo02 {
    public static void main(String[] args) {
        FutureTask futureTask1 = new FutureTask(new CallableImpl());
        Thread thread = new Thread(futureTask1, "AA");
        thread.start();


    }
//    将来的任务,这里面单独地而处理,避免了线程的堵塞
    /*
    *
    *
    * */
}

class CallableImpl implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {

        System.out.println("come in callable");
        return 2011;
    }
}
