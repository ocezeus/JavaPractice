package com.practice6.file;

import java.io.File;
import java.io.IOException;

public class filedemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\nmsl\\wuhu\\java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("F:\\nmsl\\wuhu\\shit");
        System.out.println(f2.mkdir());

        File f3 = new File("F:\\nmsl\\huwu\\holy\\aaaa");
        System.out.println(f3.mkdirs());
    }
}
