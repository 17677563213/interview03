package com.wxy.singtom;

public class Test01 {

    public static void main(String[] args) {
//        私有的构造法的话，在其它类里就不能够在通过关键字的形式来实现创建对象了


//     其实要使用的话直接的通过类名，点上变量的名称

        Singleton instance = Singleton.INSTANCE;
        System.out.println(instance);
//       采用的模式：
//        饥饿的模式，
//        这里面采用静态变量保存创建出来的对象
//        为了表示这是单例的模式，这里面的对象不能够修改，所以添加上了finall
//        这里面的添加了私有的构造方法，的目的就是不让别人通过new 的形式来实现创建对象
//        只能够通过采用类名点上变量的名称来实现获取到对象
//        这样的模式的话不管使用还是不使用都会创建出来对象
//        访问的权限，static ,不能够修改




    }
}
