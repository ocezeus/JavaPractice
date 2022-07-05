package com.practice5.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class cod2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();

        Student s1 =new Student("刀哥",34);
        Student s2 =new Student("虎弟",22);
        Student s3 =new Student("小丸子",86);
        Student s4 =new Student("大丸子",86);

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                int j = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return j;
            }
        });

        for(Student s : al){
            System.out.println(s);
        }
    }
}
