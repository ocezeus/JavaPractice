package com.practice6.byteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class stream4 {
    public static void main(String[] args) {
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("F:\\nmsl\\wuhu\\7.txt");
            f.write("nmsl".getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(f !=null){
                try {
                    f.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
