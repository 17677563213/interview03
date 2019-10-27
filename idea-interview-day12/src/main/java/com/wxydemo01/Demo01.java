package com.wxydemo01;
//资源类:
class  MyDate{
 volatile     int number = 0;
    public void  changeNumber(){
        this.number=100;
    }

}


public class Demo01 {
    public static void main(String[] args) {
        MyDate myDate =new MyDate();
//        创建多线程的方式,使用lanbda表达式:
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" change the number");
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myDate.changeNumber();
            System.out.println(Thread.currentThread().getName()+"the number is changed. the result is :" + myDate.number);


        },"AA").start();

        while (myDate.number==0){


        }
        System.out.println(Thread.currentThread().getName()+"main find that  the number  is change");

//        这里面的结构:
//        如果是主线程是第一位的话,后面的线程都是要在后面,这里面没有对变量添加volatile  线程之间要修改数据的话,是要讲内容拷贝到自己的线程工作空间里面




    }




}
