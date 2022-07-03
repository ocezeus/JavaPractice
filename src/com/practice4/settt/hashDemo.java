package com.practice4.settt;

import java.util.HashSet;
import java.util.Set;

public class hashDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");

        set.add("world");

        for(String s: set){
            System.out.println(s);
        }
    }
}
