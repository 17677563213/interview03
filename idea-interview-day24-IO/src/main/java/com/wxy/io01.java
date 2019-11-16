package com.wxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class io01 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("e:" + File.separator + "I" + File.separator + "love" + File.separator + "you.txt");
        if(file.exists()){
            InputStream fileInputStream = new FileInputStream(file);

//        这里面的思路:就是要获取到自己操作文件的对象
//            这里面要想对文件操作的话,这里面就确定要写还是要读,这里面不同的操作使用的是不同的方法
//            使用字符操作的话,这里面的好处就是不需转化成字节的形式














        }

        }



}
