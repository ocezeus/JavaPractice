package com.practice6.byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class stream3 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream f = new FileOutputStream("F:\\nmsl\\wuhu\\7.txt",true);
        FileOutputStream f = new FileOutputStream("F:\\nmsl\\wuhu\\7.txt");

        for(int i=0;i<10;i++){
            f.write("nmsl".getBytes(StandardCharsets.UTF_8));
        }
    }
}
