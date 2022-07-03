package com.practice4.settt;

import java.util.LinkedHashSet;

public class linkerHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        lhs.add("world");

        for(String s : lhs){
            System.out.println(s);
        }
    }
}
