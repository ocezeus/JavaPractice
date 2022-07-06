package com.practice6.digui;

import java.io.File;

public class dgFile {
    public static void main(String[] args) {
        File f = new File("F:\\nmsl");

        getFile(f);

    }

    public static void getFile(File address){
        File[] inf = address.listFiles();
        for(File ff:inf){
            if(ff.isFile()){
                System.out.println(ff.getAbsolutePath());
            }else getFile(ff);
        }
    }
}
