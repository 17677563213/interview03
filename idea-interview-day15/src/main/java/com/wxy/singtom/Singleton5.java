package com.wxy.singtom;

import java.io.IOException;
import java.util.Properties;

public class Singleton5 {

    public static final  Singleton5 SINGTLETON  ;
    static {
        SINGTLETON=new Singleton5("你好");
        Properties properties =new Properties();
        try {
            properties.load(Singleton5.class.getClassLoader().getResourceAsStream(""));
        } catch (IOException e) {
//            执行，这里面如果子类里面存在了，就不会调用父类的
            e.printStackTrace();
        }
//        三种方式：
//        延迟创建对象
//        如何创建
//        提供静态的方法，
//        这里面判断是否已经是创建了
//        如果没有创建的话，这里面才会创建对象
//        上面的话不能够提供，不可以修改的
//        如果这里面为空的话，才会创建的
//        这里面通过静态的方法来创建
//      涉及到了作用域的问题：
//        如果是在方法里面定义的变量的话，或者是在非静态代码块里面定义的变量的话，就只能够在括号里面有效
//        在其他的方法里面就是没有效果了
//        所谓的这里面传递过来的之后，就是传递一个副本的形式
//        但是这里面即使是相同的名称的话，这里面还是不会影响到
    }


    private String info;

    private Singleton5(String info) {
        this.info = info;
    }
//
}
