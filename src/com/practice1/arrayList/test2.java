package com.practice1.arrayList;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("刀酱");
        arr.add("刀江");
        arr.add("刀奖");
        arr.add("刀jiang");
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
