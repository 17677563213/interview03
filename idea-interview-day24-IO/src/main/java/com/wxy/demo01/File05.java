package com.wxy.demo01;
import java.io.File;
public class File05 {
    public static void main(String[] args) {
        File file = new File("e:" + File.separator+"java");
        listDir(file);
    }
    public static void listDir(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i <files.length ; i++) {
                listDir(files[i]);
            }
        }
//        获取构造方法里面的路径
//
        System.out.println(file);
    }
//这里面静态的方法,这里面修改文件的名称
//    是否是文件,这里面需要进行匹配格式
//
}
