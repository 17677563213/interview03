package com.wxy.demo01;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File04 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:"+File.separator+"01.jpg");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println("文件不存在已经创建了"+newFile);

        }

     /*   long l = file.lastModified();
        Date date = new Date(l);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(format);

        System.out.println(date);
        System.out.println(l);*/

        long length = file.length();
//        这里面是字符串,后面的话是内容一个数字
        String format = String.format("文件大小%5.2f", length / (double) 1024 / 1024);
        System.out.println(format+"获取到的内容");
        System.out.println(length);




    }
}
