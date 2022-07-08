package com.practice6.byteOutStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class stream1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\nmsl\\wuhu\\x.txt");
        fos.write(12344);
        fos.write(432);
        fos.close();
    }
}
