package com.practice5.genericDemo;

import java.util.ArrayList;
import java.util.List;

public class peopleDemo {
    public static void main(String[] args) {
//        People p = new People();
//        p.show("nmsl");
//        p.show(123);
//        p.show(true);

        System.out.println("------------");

        List li = new ArrayList<Student>();

        Student s1 = new Student("刀哥");


        li.add(1);
        li.add(s1);

        for(int i=0;i<li.size();i++){
            Object o = li.get(i);
            System.out.println(o);
        }
    }
}
