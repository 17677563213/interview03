package com.wxy.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File08 {
    public static void main(String[] args) throws IOException {


        File file = new File("e:" + File.separator + "I" + File.separator + "love" + File.separator + "you.txt");
        System.out.println(file.getParent());
        File parentFile = file.getParentFile();
        if(!parentFile.exists()){
            parentFile.mkdirs();
//            为什么读取的时候不使用缓存区,写入的时候才需要清空处理
//            不会实现父接口,清空?
        }
        boolean newFile = file.createNewFile();
        System.out.println("创建文件的情况"+newFile);

        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write("\r\n华丽的转身,不了低调的撞墙".getBytes());


    }
}
