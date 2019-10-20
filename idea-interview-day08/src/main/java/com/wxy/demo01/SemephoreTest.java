package com.wxy.demo01;

import java.util.concurrent.Semaphore;

public class SemephoreTest {

    public static void main(String[] args) {

        Semaphore semaphore =new Semaphore(3);
        for (int i = 1; i <=40; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println("车牌号为"+Thread.currentThread().getName()+"汽车, 获取到停车位");
                    Thread.sleep(1000);
                    System.out.println("车牌号为"+Thread.currentThread().getName()+"汽车, 停车三秒后离开停车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }

            },String.valueOf(i)).start();
        }


    }
//    这里面的可以拿去餐厅吃饭,如果人比较多的话,一部人就会在外面等待,里面的人吃饭之后,有空位了,这时候就会允许一桌人进来
//    这里面有现成的控制,资源的控制
//    这里面有资源的递减,线程使用完毕之后,就要释放资源,当释放资源,这里面的资源就会累加,原本是0的话,这时候就会累加到1
//    这里面的资源就好比线程池里面的线程,或者是数据库连接池里面的连接的资源
}
