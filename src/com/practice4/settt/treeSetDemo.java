package com.practice4.settt;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSetDemo {
    public static void main(String[] args) {
//        TreeSet<Integer> tset = new TreeSet<Integer>();
//        tset.add(10);
//        tset.add(40);
//        tset.add(20);
//        tset.add(60);
//
//        for(Integer i:tset){
//            System.out.println(i);
//        }

//        TreeSet<Student> ts = new TreeSet<Student>();
//
//        Student s1 = new Student("刀哥",33);
//        Student s2 = new Student("虎弟",3);
//        Student s3 = new Student("嘉然",333);
//        Student s4 = new Student("1嘉然",5);
//        Student s5 = new Student("2居然",5);
//
//        ts.add(s1);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s4);
//        ts.add(s5);
//
//        for(Student s : ts){
//            System.out.println(s);
//        }

        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getAge() - s2.getAge();
                int j = i==0?s1.getName().compareTo(s2.getName()):i;
                return j;
            }
        });


        Student s1 = new Student("刀哥",33);
        Student s2 = new Student("虎弟",3);
        Student s3 = new Student("嘉然",23);
        Student s4 = new Student("1嘉然",5);
        Student s5 = new Student("2居然",5);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s:ts){
            System.out.println(s);
        }
    }
}
