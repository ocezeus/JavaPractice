package com.practice1.arrayList;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("666");
        array.add(1,"888");
        array.add("中华有为");

//        System.out.println(array);
//        array.remove("888");
//        System.out.println(array);
//        array.remove(0);
//        System.out.println(array);
        array.set(0,"nmsl");
        System.out.println(array);
        System.out.println(array.get(2));
        System.out.println(array.size());
    }
}
