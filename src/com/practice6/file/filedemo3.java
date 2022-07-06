package com.practice6.file;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;

public class filedemo3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\nmsl\\wuhu\\java.txt");
        System.out.println(f1.createNewFile());

//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getPath());
//        System.out.println(f1.getName());
//        File f2 = new File("F:\\nmsl\\wuhu");
//        String[] s = f2.list();
//        File[] f = f2.listFiles();
//        System.out.println("-----------");
//        for(String ss:s){
//            System.out.println(ss);
//        }
//        System.out.println("------------");
//
//        for(File ff:f){
//            System.out.println(ff);
//        }
        boolean delete = f1.delete();
        System.out.println(delete);

        File f2 = new File("F:\\nmsl\\wuhu\\biantai");
        System.out.println(f2.mkdir());

        File f3 = new File("F:\\nmsl\\wuhu\\biantai\\quehsi.md");
        System.out.println(f3.createNewFile());

    }
}
