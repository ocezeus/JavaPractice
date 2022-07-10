package com.practice6.byteInStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\nmsl\\wuhu\\test.png");
        FileOutputStream fos = new FileOutputStream("F:\\nmsl\\huwu\\test.png");

        byte[] bt = new byte[1024];
        int len;
        while((len=fis.read(bt))!=-1){
            fos.write(bt,0,len);
        }

        fis.close();
        fos.close();
    }
}
