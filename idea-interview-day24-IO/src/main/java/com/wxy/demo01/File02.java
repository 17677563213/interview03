package com.wxy.demo01;

import java.io.File;

public class File02 {
    public static void main(String[] args) {
//       添加包的快捷键,还有添加抛异常的快捷键都是一样的alt+enter

        File oldfile = new File("E:"+File.separator+"demo01.txt");
//        替换文件的名称:
        File newfile = new File("E:"+File.separator+"welcome.txt");
        boolean b = oldfile.renameTo(newfile);
        System.out.println(b+"文件名称替换情况");
//        使用的场景:该目录里面有很多的东西:info:这里面保存信息的定义,
        /**

        File file = new File("E:"+File.separator+"demo01.txt");
        System.out.println(file);
//        获取的结果是操作文件的路径
//      里面对应的方法:判断该路径下面是否事文件,是否是目录,
//
        System.out.println(file.isFile());
        System.out.println("+++++++++++");
        System.out.println(file.isDirectory());
        System.out.println("+++++++++++");
        System.out.println(file.getName());
        System.out.println("+++++++++");
        System.out.println(file.canExecute());
        System.out.println("+++++++++");
        System.out.println(file.canRead());
        System.out.println("+++++++");
        System.out.println(file.canWrite());
        System.out.println(file.exists());

        System.out.println(File.separator);

        File file1 = new File("d:" + File.separator + "yuexiaduzuo.txt");
        System.out.println(file1);
//        在文件里面实现修改名称,这里面都是使用对象的时候,在后面的时候在替换掉

         *
         */

    }
}
