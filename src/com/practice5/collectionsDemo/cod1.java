package com.practice5.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

public class cod1 {
    public static void main(String[] args) {
        List<Integer> li =new ArrayList<Integer>();
        li.add(30);
        li.add(10);
        li.add(50);
        li.add(60);
        li.add(40);

        Collections.sort(li);

        System.out.println(li);

        Collections.reverse(li);
        System.out.println(li);

        Collections.shuffle(li);
        System.out.println(li);
    }
}
