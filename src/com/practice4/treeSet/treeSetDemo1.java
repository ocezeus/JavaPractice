package com.practice4.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int totalGrade1 = o1.getMathGrade() + o1.getChineseGrade();
                int totalGrade2 = o2.getMathGrade() + o2.getChineseGrade();
                int i = totalGrade2 - totalGrade1;
                int j = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return j;
            }
        });

        Student s1 = new Student("刀哥",120,56);
        Student s2 = new Student("虎弟",57,98);
        Student s3 = new Student("嘉然",3,5);
        Student s4 = new Student("风小逸",3,5);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student s : ts){
            System.out.println(s);
        }
    }
}
