package com.wxy.demo01;

public class Thread01 {

// 这里面的判断,不是涉及到了权限的问题
//    文件是否能够执行
//
//    要求:在主线程里面要执行的前面要执行一次的话,
//    也是避免在里面不需要重复的进行比较,
//    其实这里面的话只需要进行一次比较就可以了,
//    而且要求要主线程前面要执行,因为下面的代码都是要依赖上面的执行之后才能够执行
//    这里面的方法是否能够执行 execute()
//    是否能够读前面添加一个can
//    获取到到了文件的绝对路径,所谓的绝对路径就是

    public static void main(String[] args) {
        new Thread(()->{

            System.out.println(Thread.currentThread().getName()+"现在是子线程");
        },"son thread").start();

        System.out.println(Thread.currentThread().getName());

//    得出的结论:,主线程是先执行的
//        模拟静态的代码块
    }
}
