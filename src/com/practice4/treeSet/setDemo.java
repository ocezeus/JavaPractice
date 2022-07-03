package com.practice4.treeSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        Random r = new Random();

        while (set.size()<10){
            set.add(r.nextInt()+1);
        }

        for(Integer i:set){
            System.out.println(i);
        }
    }
}
