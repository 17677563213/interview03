package com.wxy.demo01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncAndReetrantLock {
    public static void main(String[] args) {
//        创建资源类对象:
        ShareResourc shareResourc =new ShareResourc();
        new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                shareResourc.print5();


            }

        },"AA").start();
        new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                shareResourc.print10();


            }

        },"BB").start();

        new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                shareResourc.print15();


            }

        },"CC").start();









    }
}

//创建资源类:
class ShareResourc{
    private Integer number=1;
    private Lock lock =new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();


    public void print5(){
        lock.lock();
//        多线程使用资源类步骤:
        try {
//        1.进行判断
            while(number!=1){
                condition1.await();

            }
//        2.执行业务逻辑
            for (int i = 1; i <=5 ; i++) {
                System.out.println(Thread.currentThread().getName()+"线程打印第 "+i);
//     实现多线程的方式:
//                区别:
//                没有返回的数据
//                要求线程的工作内容
//                错误的原因,的话就是要知道这里面错误的原因
//                第二个就会抛异常
//                ,执行的方法不一样
//

//


            }

//        3.唤醒(有时需要精确的唤醒)
            number=2;
            condition2.signal();
//            垃圾回收算法与垃圾回收器的关系
//            这里面都会涉及到了Java里面的垃圾回收,这里面的垃圾
//            JavaGC垃圾回收算法哪四种 应用计数,复制算法,标记清除算法,标记整合算法
//            标记-清除算法:
//            标记-整理:
//            复制算法:
//            分代收集算法:
//
//
//
//
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            释放资源
//            这里面还是存在问题的:
//            所以这里面的话全部都是需要靠自己才可以
            lock.unlock();
        }


    }
//    第二个方法打印10次:
public void print10(){
    lock.lock();
//        多线程使用资源类步骤:
    try {
//        1.进行判断
        while(number!=2){
            condition2.await();

        }
//        2.执行业务逻辑
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"线程打印第 "+i);

        }

//        3.唤醒(有时需要精确的唤醒)
        number=3;
        condition3.signal();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
//            释放资源
        lock.unlock();
    }
//     redis   mongdb
//    垃圾收集器,算法,复制拷贝,标清,标整,分代收集
//    复制用在新生,
//    标记的,就会用到年老代
//


}

//定义打印十五次的方法:
public void print15(){
    lock.lock();
//        多线程使用资源类步骤:
    try {
//        1.进行判断
        while(number!=3){
            condition3.await();

        }
//        2.执行业务逻辑
        for (int i = 1; i <=15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"线程打印第 "+i);

        }

//        3.唤醒(有时需要精确的唤醒),这里面的话都是传递接口的,我靠我现在的话就是一个水货
//        构造方法,这里面的话就是通过构造构造方法里面需要的参数就是一个接口,
//        日志排查,获取字节码,获取名称,人家太厉害了,别人高级的工程师,一遇到问题的话,就可以通过这里面去分析,
//        写一个模板就可以处理这里面的全部的问题,太厉害了,我什么时候才能够练就成这样的水平
//        这里面的话多线程while() 进行判断
//        这里面的接口该如何的写,资源类,堵塞队列里面添加数据
//        对象里面添加元素
//        我靠,这里面都是一些比较高级的neirong
//        先跳过
//        多线程的实现的方式
//        第三和第四
//        怎么使用多线程
//        集合的话,就是面向接口编程
//        实现一接口,runnable() 为什么工作里面的话都是通过实现接口来实现的
//        这里面的话就是通过逻辑代码写在run()的方法里面去
//
//
//        获取
        number=1;
        condition1.signal();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
//            释放资源
        lock.unlock();
//        创建一个变量,多线程的话,这里面添加了锁,这里面的话多线程的话,要对变量添加 volatile ,这里面保证了多线程下面的变量的可见性
//        这是什么?原子性变量,我现在知道了他们,但是我不知道,这里面一个都不知道
//        阿里基础架构部
//        我靠,太厉害了
//        传接口
//        不能够传递具体类
//       全部适配
//        依赖注入,设置注入,构造注入
//        构造方法,
//

    }


}


}
//      别人遇到的问题是什么,自己的话不要将自己精力分散,集中精力要不然的话就会非常的容易出现问题
//        同步关键字:
//        底层有一个技术器
//        不会出现死锁
//        系统级别
//        一个是具体类
//        区别
//        使用方式
//        这里面的话不需要用户释放锁
//        这里面需要用户手动的释放锁
//        等待是否可中断
//        上面的是不可以中断
//        最后面的话是可以中断的,工具类
//        interrupt()
//第四种:
//        上面的是非公平锁
//        第二个的话reentrantLock()
//        第五种:
//        绑定,分组唤醒,可以实现精确唤醒,这里面的话全部唤醒,太厉害了
//        这里面的话,要求精确的唤醒,
//
//问题, synchronized 与lock的区别:
//        synchronized 是Java里面的关键字 他是Java虚拟机层面的,底层通过monitor来实现
//        他的wait() nodify()的方法也是要依赖monitor来实现
//        lock()他是一个具体类
//        synchronzied 使用的方式: 使用的的代码块的话,不需要用户手动的释放锁,他会自动的释放
//        而且他不会存在死锁的问题,因为这里面不管怎么样都会退出的,如果是正常的话就会正确退出,如果异常的话也是会异常退出
//        如果使用了lock的话需要开发人员通过finally的代码块区域进行锁的释放
//        对于执行过程而言,synchronzide 修饰的代码块的话这里面是不能够中断的
//        而使用lock的话这里面可以通过interrupt()的形式来实现中断
// 对于锁而言:
//        synchronzide:默认的情况下是非公平锁
//        lock两种情况下都是可以的
//        对于效率而言的话非公平锁效率会比较高
//        对于绑定而言,condition lock能够实现精确的唤醒,
//        他们的区别主要从五个方面去考虑
//        第一个就是是否是关键字,是否是一个具体类
//        他们的使用的情况,主要是就是是否需要开发人员手动的释放锁
//        第三种:就是公平的问题
//        第四个:就是是否能够被中断
//        第五个问题是否能够被condition
//        但是对于他们的使用,我还是非常的陌生,
//        lock()的话就是通过创建对象通过创建对象之后调用newCondition()来实现最后面的唤醒的操作
//        lock的作用就是添加锁,后面的话就是释放锁
//        这里面主要是对一个方法的编写的时候就认识的
//        可是对于使用synchronzide关键字的使用我依旧i是非常的陌生
//        使用lock的话有什么好处:能以精确的唤醒线程
//        可以实现线程中断:
//        多线程要求
//        这里面的话就是按照顺序去执行,
//        前面的执行完了,等待第二个去实现,按照顺序去执行
//        这里面该如何去实现
//        使用的具体的知识点 lock()
//        线程操作资源类
//        线程之间的通讯,判断,nodify() 资源类的定义:创建私有的变量,  数据类型
//        多线程的编程,就是做完之后就要通知
//        多线程判断,执行,通知
//        创建锁的对象
//        创建一个方法
//        遍历
//        这里面的要求的话,就是要通过添加所的话放在最外面
//        如何表面线程的虚假唤醒,就是通过while()进行判断,而不是使用if()
//        调用打印五次
//        怎么通知
//        如何保证这里面的话自己能够精确的唤醒,所谓的原来这里面的话唤醒,是对面的
//        为什么创建创建多个
//        等待
//        这里面反向的控制
//        修改标志位
//        signal():
//        怎么实现精确的唤醒,这里面的话就是通过该锁创建要还行的对象
//        等待的话使用的是什么
//          等待也是通过使用的是绑定的对通知的话使用的也是 绑定的对象
//        这里面实现了精确的唤醒
//        这里面倒回去
//         一把锁里面有三把钥匙
//        通过这个让其休眠
//        通过要通过
//      这里面要明确他的下标
//        一把锁里面添加了钥匙
//        三个线程,每一个线程执行的次数
//        调用
//        打印
//        第二个线程
//        通过对象调用方法
//        资源类里面的方法
//        这里面锁绑定了钥匙
//        如果不等于这个的话,不等于的话不能够执行,就要在这里面等待
//        这里面的程序太厉害了
//        定义了资源类,在自己的主类里面,就会创建一个多线程的情况
//        就会创建一个多线程得情况
//        调用的话这里面通过创建一个变量作为执行
//        多线使用资源类的话,步骤,进行判断,如果不是该线程要做的话就会等待,也就是不满足条件的情况就会在这里面等待,所谓的等待的话就是通过绑定的形式调用await()
//        执行完毕自己的任务之后,就会通知其他线程,之前的话使用的就是唤醒全部的线程
//        而且这里面的话需要修改这里面的数字,而且这里面要唤醒的话要通过对象调用
//        如果不是的话就会在这里面停止
//        也就是等待的状态
//        线程的状态,一种就是准备状态, 执行状态,堵塞状态
//        创建三个线程,这里面的话执行十次该如何的控制
//        每一个线程调用对应的方法
//        这里面要执行十次的话
//
//这里面体现了 使用lock 能够实现精确的的唤醒的模式
//如果使用synchronzide 的话,这里面就不能够实现精确的唤醒线程了,所谓的线程的唤醒是相对于前面的等待的而言的
//volatile: cas:的理念:
//堵塞队列
//理论,demo ,总结
//  这里面就是总结:消费,生产,不需要添加程序员的, 堵塞队列,不需要?
//怎么实现,这里面的话该如何来实现
