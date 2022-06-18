package com.practice1.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo2 {
    public static void main(String[] args) {
        ArrayList<Student2> studentArr = new ArrayList<Student2>();
        for(int i = 0;i<3;i++){
            addStudent(studentArr);
        }
        for(int i = 0;i<studentArr.size();i++){
            Student2 ss = studentArr.get(i);
            System.out.println("name:"+ss.getName()+",age:"+ss.getAge());
        }
    }

    public static void addStudent(ArrayList<Student2> studentArr){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        Student2 s = new Student2(name,age);

        studentArr.add(s);
    }
}
