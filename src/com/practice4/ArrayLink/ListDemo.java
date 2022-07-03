package com.practice4.ArrayLink;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
//        ArrayList<String> li = new ArrayList<String>();
//        li.add("java");
//        li.add("hello");
//        li.add("world");
//
//        for (String s : li) {
//            System.out.println(s);
//        }
//        System.out.println("--------------");

        LinkedList<String> lli = new LinkedList<String>();
        lli.add("hello1");
        lli.add("hello2");
        lli.add("hello3");

        round(lli);

        String s1 = lli.getFirst();
        System.out.println(s1+"ssa");
        lli.addFirst("hello0");
        round(lli);

        lli.addLast("hello-fin");
        round(lli);

        lli.removeLast();
        round(lli);
    }

    public static void round(LinkedList lli){
        Iterator<String> lit = lli.iterator();
        while(lit.hasNext()){
            String ss = lit.next();
            System.out.println(ss);

        }
        System.out.println("-----------");
    }
}
