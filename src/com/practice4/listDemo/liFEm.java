package com.practice4.listDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class liFEm {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();

        li.add("hello");
        li.add("world");
        li.add("nmsl");

        for(String s : li){
            System.out.println(s);
        }
//       ListIterator<String> lit = li.listIterator();
//        while(lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }

//        while (lit.hasPrevious()){
//            String ss = lit.previous();
//            System.out.println(ss);
//        }
//        while (lit.hasNext()){
//            String s = lit.next();
//            if(s.equals("world")){
//                lit.add("刀哥");
//            }
//        }
//        System.out.println(li);



    }
}
