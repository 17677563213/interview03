package com.wxy.demo01;

import com.wxy.entity.People;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ClassDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        第一种获取到class对象通过全类名的形式,这种方式使用在从配置文件里面获取到的信息
        Class<?> aClass = Class.forName("com.wxy.entity.People");
        System.out.println(aClass+"/t");
//       这里面获取到的内容就是包路径,还有就是类的名称
//        上面的情况就是,还在磁盘里面的时候获取的方式
        Class<People> peopleClass = People.class;
        System.out.println("第二种方式获取的内容,这种方式已经是通过类加载器,加载到内存里面去了"+peopleClass);

        System.out.println("++++++++++++");
        People people = new People();
        Class<? extends People> aClass1 = people.getClass();
        System.out.println(aClass1);
//        在有对象的情况下,就可以使用该方法
//        上面的话就是在内存里面,这时候通过类名的形式来实现获取到
        Field[] fields = aClass.getFields();
        System.out.println(fields.length);
//        原来是这样遍历的
//        iter

        List list =new ArrayList<>();
//        使用最多的就是fori  iter
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println(o);
        }




    }
}
