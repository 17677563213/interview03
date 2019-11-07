package com.wxy.demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class File03 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
//        问题:如何将时间戳变成Java的时间数据类型,将时间戳,方法时间对象里面,在创建对象的时候,作为参数放到里面
//        这里面在简单的日期的格式,在括号里面填写自己需要的个数,yyyy:表示年  MM:表示月份 dd:表示日期
//        后面的话需要调用方法format()通过获取到对象之后调用方法,这里面需要的参数就是自己的时间的对象
//
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(format);



    }
}
