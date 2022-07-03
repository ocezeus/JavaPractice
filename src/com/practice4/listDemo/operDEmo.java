package com.practice4.listDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class operDEmo {
    public static void main(String[] args) {
        Student s1 = new Student("刀哥", 33);
        Student s2 = new Student("刀哥1", 333);
        Student s3 = new Student("刀哥2", 233);

        List<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);

        Iterator<Student> it = li.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);

        }

        for(int i = 0; i<li.size();i++){
            Student ss = li.get(i);
            System.out.println(ss);
        }
    }
}
