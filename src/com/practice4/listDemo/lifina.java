package com.practice4.listDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lifina {
    public static void main(String[] args) {

        Student s1 = new Student("刀哥", 33);
        Student s2 = new Student("虎弟", 323);
        Student s3 = new Student("团长", 333);

        List<Student> stl = new ArrayList<>();
        stl.add(s1);
        stl.add(s2);
        stl.add(s3);

        for(Student s :stl){
            System.out.println(s);
        }
        System.out.println("--------------");

        ListIterator<Student> lit = stl.listIterator();
        while (lit.hasNext()){
            Student ss = lit.next();
            System.out.println(ss);
        }

        System.out.println("---------------");

        for(int i = 0;i<stl.size();i++){
            Student sss = stl.get(i);
            System.out.println(sss);

        }

    }
}
