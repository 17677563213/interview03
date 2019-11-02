package com.wxy.singtom;

public class Singleton {
//   提供静态变量：
    public static  final  Singleton INSTANCE=new Singleton();

    public  Singleton getInstance(){
//
// 包含了类信息
//        资源释放掉
//
        return INSTANCE;
    }





}
