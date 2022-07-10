package com.practice6.byteInStream;

import java.io.FileInputStream;
import java.io.IOException;

public class stream3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\nmsl\\wuhu\\test.txt");

//        int read1 = fis.read();
//        System.out.println(read1);
//
//        byte[] bt = new byte[5];
//        int read = fis.read(bt);
//        System.out.println(bt);
//        System.out.println(read);

        byte[] bt = new byte[1024];
        int len;
        while ((len=fis.read(bt))!=-1){
            System.out.println(new String(bt,0,len));
        }

        fis.close();
    }
}
