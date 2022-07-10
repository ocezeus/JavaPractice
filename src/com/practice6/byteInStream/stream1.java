package com.practice6.byteInStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class stream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\nmsl\\wuhu\\7.txt");
//        int read = fis.read();
//        System.out.println((char) read);
//
//        int read1 = fis.read();
//        System.out.println((char) read1);

        while (true){
            int readnb = fis.read();
            if(readnb==-1){
                System.out.println("finish1");
                break;
            }else {
                System.out.print((char) readnb);
            }

        }
        System.out.println("finish2");

        fis.close();
    }
}
