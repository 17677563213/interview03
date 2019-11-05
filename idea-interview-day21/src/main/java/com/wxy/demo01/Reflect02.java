package com.wxy.demo01;

import com.wxy.entity.People;

import java.lang.reflect.Field;

public class Reflect02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<People> peopleClass = People.class;
        Field hobbies = peopleClass.getField("hobbies");
        System.out.println(hobbies+"获取单个public 属性");

        Field[] declaredFields = peopleClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("++++++++++");
            System.out.println(declaredField);
        }

        Field username = peopleClass.getDeclaredField("username");
     //   username.setAccessible(true);
        People people = new People();
        System.out.println("对私有的属性进行获取数据,上次的话,获取的是public");
        Object o = username.get(people);
        System.out.println(o
        );
    }
}
