package com.wxy.demo01;

import com.wxy.entity.People;

import java.util.concurrent.atomic.AtomicReference;

public class Demo01 {
    public static void main(String[] args) {
//        创建对象:

        People people =new People("月下独酌","男");
        People people2 =new People("月下独酌2","男2");

        AtomicReference<Object> objectAtomicReference = new AtomicReference<>();
        objectAtomicReference.set(people);
        System.out.println(objectAtomicReference.compareAndSet(people, people2)+"\t"+objectAtomicReference.get());


    }
}
