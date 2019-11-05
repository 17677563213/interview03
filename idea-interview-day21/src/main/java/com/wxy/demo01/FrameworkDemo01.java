package com.wxy.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class FrameworkDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();

        ClassLoader classLoader = Reflect01.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);
        String className = properties.getProperty("classname");
        System.out.println(className+"配置文件获取到的内容");
        String classMethod = properties.getProperty("classMethod");
        System.out.println(classMethod+"配置文件获取到的内容");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(classMethod);
        method.invoke(o);


    }
}
