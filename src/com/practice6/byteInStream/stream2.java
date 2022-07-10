package com.practice6.byteInStream;

import java.io.*;

public class stream2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\nmsl\\wuhu\\7.txt");

        File f = new File("F:\\nmsl\\wuhu\\test.txt");
        f.createNewFile();

        FileOutputStream fos = new FileOutputStream("F:\\nmsl\\wuhu\\test.txt");
        FileInputStream fis1 = new FileInputStream("F:\\nmsl\\wuhu\\test.txt");

        while(true){
            int read = fis.read();
            if(read!=-1){
//                System.out.print("正在录入");
                System.out.println((char)read);
                fos.write(read);
            }else {
                System.out.println("录入完成");
                break;
            }
        }

        while(true){
            int read1 = fis1.read();
            if(read1!=-1){
//                System.out.print("正在录入");
                System.out.print((char)read1);
//                fos.write(read);
            }else {
//                System.out.println("录入完成");
                break;
            }
        }

        fos.close();
        fis.close();
        fis1.close();



    }
}
