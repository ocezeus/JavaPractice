package com.practice6.file;

import java.io.File;
import java.util.logging.FileHandler;

public class filedemo1 {
    public static void main(String[] args) {
        File f1 = new File("F:\\nmsl\\wuhu\\java.txt");
        System.out.println(f1);

        File f2 = new File("E:\\nmsl\\wuhu\\","java.txt");
        System.out.println(f2);

        File f3 = new File("F:\\nmsl\\wuhu");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
