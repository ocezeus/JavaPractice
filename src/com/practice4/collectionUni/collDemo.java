package com.practice4.collectionUni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collDemo {
    public static void main(String[] args) {
        Collection<Student> stu = new ArrayList<Student>();

        Student s1 = new Student("刀哥",22);
        Student s2 = new Student("糕哥",212);
        Student s3 = new Student("giao哥",422);

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        Iterator<Student> it = stu.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

    }
}
