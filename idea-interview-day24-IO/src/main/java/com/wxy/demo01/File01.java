package com.wxy.demo01;

import java.io.File;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) throws IOException {


        File file = new File("E:" + File.separator + "demo01.txt");
        System.out.println(file.createNewFile());


    }
}
