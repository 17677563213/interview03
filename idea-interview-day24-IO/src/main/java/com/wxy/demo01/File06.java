package com.wxy.demo01;

import java.io.File;

public class File06 {

    public static void main(String[] args) {

        File file = new File("e:" + File.separator + "a" + File.separator + "b" + File.separator + "itcast.txt");
        System.out.println(file.getPath());

        boolean mkdirs = file.mkdirs();
        System.out.println("创建多个文件成功"+mkdirs);
//

    }
}
