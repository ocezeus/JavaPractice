package com.practice4.settt;

import java.util.HashSet;

public class hashSetDemp {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("刀哥",45);
        Student s2 = new Student("虎弟",25);
        Student s3 = new Student("嘉然",43);
        Student s4 = new Student("嘉然",43);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        hs.add(s4);
        for(Student s: hs){
            System.out.println(s);
        }
    }
}
