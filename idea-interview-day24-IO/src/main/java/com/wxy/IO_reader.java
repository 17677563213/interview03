package com.wxy;

import java.io.*;

public class IO_reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("e:" + File.separator + "I" + File.separator + "love" + File.separator + "you.txt");
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            byte [] bytes =new byte[1024];
            fileReader.read(bytes);


        }



    }
}
