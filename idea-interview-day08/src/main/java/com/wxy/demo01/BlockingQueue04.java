package com.wxy.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueue04 {

    public static void main(String[] args) throws InterruptedException {
      /*  BlockingQueue<String> stringBlockingQueue =new ArrayBlockingQueue<>(3);
        System.out.println(stringBlockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(stringBlockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(stringBlockingQueue.offer("a", 2000L, TimeUnit.SECONDS));
        System.out.println(stringBlockingQueue.offer("a", 10L, TimeUnit.SECONDS));*/
//        怎么使用,这里面就会是调用这里面的方法,业务逻辑的实现
//        底层的原理,业务逻辑
//        都是非常的重要的
//        代码库,别人加班,你加薪,就是上传到代码库里面去
//        通过队列:
//        非公平锁:
//


//

//        前面学习的知识点:
//        多线程下面高并发的集合安全的问题,这里面主要涉及到了ArrayList()  该集合是单列集合,他是可以重复,有顺序
//        他的底层的数据结构是一个动态的数组,通过add() 的方式来实现添加元素,

        List<String>  list =new ArrayList<>();
        list.add("准备阶段");
        System.out.println("第二种方式,就是通过集合对象来实现获取");
        System.out.println(list.get(0));
        for (String str :list) {


            System.out.println("+++++++++++++++++++");
            System.out.println(str);
//            出现多线程不安全的原因: 在同一时间里面多个线程对集合对象进行添加元素的操作,这里面就好比签名一样,前面还没有将名字签完,后面的人就将其抢走,
//
//            多线程:处理的方式
//   方案一:new voletor() :该集合的特点就是对集合的对象进行加锁的操作,只允许一线程对集合对象进行操作,通过加锁的方式,这里面就保证了数据的原子性
//            但是使用该方式处理的话,就会牺牲效率的问题,因为在同一时间里面只运行一个线程对集合对象进行操作,这样就会就无法解决多线程下面的高并发问题
//  方案二:
//            使用集合工具类collection.synchronizedList(new ArrayList()) :静态方法,通过弄过类点上方法的名称,这里面需要一个对象
// 方案三:
//            copyOnWriteArrayList():他的原理:在写之前,对集合对象进行拷贝,获取到副本,之后对副本进行扩容,在对副本集合对象,进行添加元素的操作,添加完毕之后,替换掉原来的集合的对象,这时候就可以实现处理这里面的问题
// 方案四: 采用读写分里的思想
//            new
//学习的三大板块: 认识原理>>上代码>>总结(结合生活上的例子方便自己的理解)

//这里面的话,就是头尾创建对象,中间使用对象作为参数
        }

    }
}
