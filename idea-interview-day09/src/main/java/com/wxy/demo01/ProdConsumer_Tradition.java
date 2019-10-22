package com.wxy.demo01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProdConsumer_Tradition {

//    多线程下面的生产者与消费者模式
//    具体描述:一个线程负责生产,一个线程负责消费,顶一个功能,通过两个线程来实现,对一个变量进行加一减一的操作
//    这里面的实现的方式就是,线程里面的工作就是调用方法就可以了,
//    具体的业务的话就是通过顶一个类来实现,实际的操作就是通过定一个方法,这里面要对其方法进行加锁的操作,
//    怎么实现对该方法进行加锁的操作,在类的外面创建所的对象,添加锁的话就是通过该对象lock.lock() ,释放锁的时候就是使用
//    lock.umlock() 的形式
//    但是对于唤醒的话使用的就是condition.s 所以在外面的话要通过lock.newCondition()的方法来实现获取到该对象
//    添加锁的话最后面要通过异常的抓取的里面的fianlly的形式来实现释放锁
//    如何创建一个线程new thread() 在里面使用lanbda表达式,格式()->{}逻辑代码写在括号里面,最后面的话通过调用start()的形式来实现
//    启动,这里面的话可以创建多个线程,这里面多个对线程的操作的话要注意了多线程下面变量的可见性
//    多线程下的集合的安全的问题,主要是对于list 还有就是对于其集合的问题
//    synchronized:同步
//    使用起来有什么好处:
//    synchronized与lock区别:
//    区别:效率的问题?
//    1.synchronized:是Java虚拟机层面,是Java里面的关键字,汇编语言,monitor对象来实现的
//    lock 具体类,
//
//

    public static void main(String[] args) {

        ShareDate shareDate =new ShareDate();

//        创建线程
        new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                try {
                    shareDate.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        },"AA").start();


//        创建消费者线程:
        new Thread(()->{
            for (int i = 1; i < 5; i++) {
                try {
                    shareDate.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }


        },"BB").start();


    }
}

//编写资源类:类里面的内容,添加变量私有的变量 ,私有的对象,通过私有的对象调用对用的方法
//在里面编写方法,这里面的方法的话就会添加上锁的机制
//这里面的程序就好像,对空调的问题进行操作,同一时间内容只允许进行一次的操作,
//如果这里面到了零界点就会进行等待,对于等待的话最后面还是要通知,因为自己要释放资源,要让别人去执行

class ShareDate{
    private Integer number=0;
    private Lock lock =new ReentrantLock();
    private Condition condition =lock.newCondition();

    public void increment () throws  Exception{
            lock.lock();
        try {
            while (number!=0){
                condition.await();

            }
            number++;
            System.out.println(Thread.currentThread().getName()+" "+number);
            //        执行完毕通知别人去执行:
            condition.signalAll();

        } catch (InterruptedException e) {
//            多线程下面的生产者,与消费者的模式
//            这里面通过两个线程,来实现多一个资源类的方法里面的内容进行
//            虚假唤醒: wait:object    这里面等待,
//           中断,和虚假唤醒,
//            多线程里面不能够使用if()
//            为什么?
//            两个线程
//            为什么使用if的形式判断就会出现问题
//  为什么会这样,没有控制住,多线程的判断必须要使用while()
//            进行判断,多线程使用的判断语句使用的就是while()
//
//           e.printStackTrace();
        } finally {
            lock.unlock();
        }




    }
//    递减的方法
public void decrement () throws  Exception{
    lock.lock();
    try {
        while (number==0){
            condition.await();

        }
        number--;
        System.out.println(Thread.currentThread().getName()+" "+number);
        //        执行完毕通知别人去执行:
        condition.signalAll();

    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        lock.unlock();
    }




}


}


