package com.wxy.demo01;

import com.wxy.entity.People;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect_method {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<People> peopleClass = People.class;
        System.out.println(peopleClass+"字节码对象");
        Method eat = peopleClass.getMethod("eat");
        People people = new People();

        eat.invoke(people);
        System.out.println("+++++++++++++++++++");
        Method eat1 = peopleClass.getMethod("eat", String.class);
        eat1.invoke(people,"苹果");
//        在获取字节码对象的时,获取里面的成员的方法,需要的参数,就是方法里面的名称
//        第二个就是参数类型的字节码,这样的话才知道获取的是什么方法,因为在里面存在方法的重载
//        再调用方法的时候要直到该方法是谁的,所以要创建对象
        Method[] methods = peopleClass.getMethods();
        for (Method method : methods) {
            System.out.println("++++获取的方法的名称++++");
            System.out.println(method.getName());
            System.out.println(method);
            String name = peopleClass.getName();
            System.out.println(name);
            System.out.println(peopleClass);
        }

    }

}
