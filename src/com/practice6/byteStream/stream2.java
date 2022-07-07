package com.practice6.byteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class stream2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\nmsl\\wuhu\\6.txt");

        File f = new File("F:\\nmsl\\wuhu\\7.txt");
        FileOutputStream doos = new FileOutputStream(f);

        doos.write(97);
        doos.write(98);

        byte[] byt = {99,100,101,102};

        doos.write(byt);

        byte[] bytes = " nmslbattle ".getBytes(StandardCharsets.UTF_8);
        doos.write(bytes);

        doos.write(bytes,3,5);
    }
}
