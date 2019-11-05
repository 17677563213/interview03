package com.wxy.demo01;

import com.wxy.entity.People;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflect03 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<People> peopleClass = People.class;
        Constructor<?>[] constructors = peopleClass.getConstructors();
        int i=2;
        for (Constructor<?> constructor : constructors) {


            System.out.println(constructor);
            if(i==2){


            Object o = constructor.newInstance();
            System.out.println(o);
            }

        }


    }


}
