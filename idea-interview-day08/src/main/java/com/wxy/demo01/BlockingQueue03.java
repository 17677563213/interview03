package com.wxy.demo01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue03 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> stringBlockingQueue =new ArrayBlockingQueue<String>(3);
        stringBlockingQueue.put("a");
        stringBlockingQueue.put("a");
        stringBlockingQueue.put("a");
        System.out.println("==========");
        stringBlockingQueue.put("a");
//        跪键盘,淫威之下
//        这里面还添加,就是前面的设置时间罢了
//        在前面的
//     注意保护好自己






    }
}
