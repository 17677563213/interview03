package com.wxy.demo01;

import com.wxy.entity.People;

import java.lang.reflect.Field;

public class Reflect01 {

    public static void main(String[] args) throws IllegalAccessException {
        Class<People> peopleClass = People.class;
        People people =new People();


        Field[] fields = peopleClass.getFields();
        for (Field field : fields) {
            field.set(people,"java你好");
            System.out.println("================");
            field.get(people);
        }

        System.out.println(people);










    }
}
