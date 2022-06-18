package com.practice1.arrayList;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();

        Student s1 = new Student("大王",12);
        Student s2 = new Student("二王",23);
        Student s3 = new Student("三王",56);

        student.add(s1);
        student.add(s2);
        student.add(s3);

        for (int i = 0;i<student.size();i++){
            System.out.println(student.get(i).getName()+student.get(i).getAge());
        }
    }
}
