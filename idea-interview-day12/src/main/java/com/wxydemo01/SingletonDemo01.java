package com.wxydemo01;

public class SingletonDemo01 {

    public static void main(String[] args) {
//        所谓的模式的话,就是不能够通过创建对象的形式也就是不能够使用new的形式
//        System.out.println(People.getPeople()==People.getPeople());
//
//        System.out.println(People.getPeople()==People.getPeople());
//        System.out.println(People.getPeople()==People.getPeople());


        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                People.getPeople();


            },String.valueOf(i)).start();
        }



    }



}

//单例模式:
class People {
    private  static volatile   People  people=null;

    private People() {
        System.out.println(Thread.currentThread().getName()+"  调用了私有的构造方法");
    }

//    提供私有的构造方法的话,这里面的原来的有参构造方法和无参构造方法都会被屏蔽掉

//    提供获取的方法:
    public static    People getPeople(){
//        double check lock:双端检索机制,就是在锁代码前进行判断,在锁的里面进行判断的处理
//        问题,跟前面的方式有有什么不同,这里面的话就可以实现比前面的并发性要好,前面的话直接的将同步锁添加到方法里面,这样的话,在同一时间里面就只能够允许一个线程去执行
//        第二种的话,在同一时间里面可以实现多线程去访问
//        存在的问题,指令重排的问题,

        if(people==null){
            synchronized (People.class){

                if(people==null){


                    return people=new People();
                }
            }
        }else{


        }
            return people;



    }
}
