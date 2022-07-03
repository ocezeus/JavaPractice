package com.practice4.settt;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        int i = set.hashCode();
        System.out.println(i);
        for(String s:set){
            System.out.println(s);
        }
    }
}
