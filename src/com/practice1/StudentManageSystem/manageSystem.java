package com.practice1.StudentManageSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class manageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> studentList = new ArrayList<student>();
        System.out.println("欢迎登录学生管理系统！");
        while (true) {

            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出系统");
            System.out.println("请输入代码：");

            int code = sc.nextInt();
            codeAnalyse(code, studentList);
            System.out.println("请继续操作");
        }

    }

    public static void codeAnalyse(int code, ArrayList<student> studentList) {
        switch (code) {
            case 1:
                addStudent(studentList);
                break;
            case 2:
                findStudent(studentList);
                break;
            case 3:
                deleteStudent(studentList);
                break;
            case 4:
                changeStudent(studentList);
                break;
            case 5:
                System.out.println("欢迎下次光临！");
                System.exit(0);
        }

    }

    public static void addStudent(ArrayList<student> studentList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        System.out.println("请输入学生学号：");
        int number = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (number == studentList.get(i).getNumber()) {
                System.out.println("已存在该学号！请重新输入：");
                number = sc.nextInt();
            }
        }


        student s = new student(name, age, number);
        studentList.add(s);
        System.out.println("添加完成！");
    }

    public static void findStudent(ArrayList<student> studentList) {
        if (studentList.size() == 0) {
            System.out.println("还没有信息，请输入学生信息！");
        } else {
            System.out.println("姓名\t年龄\t学号");
            for (int i = 0; i < studentList.size(); i++) {
                student s = studentList.get(i);
                System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getNumber());
            }
        }

    }

    public static void deleteStudent(ArrayList<student> studentList) {
        System.out.println("请输入删除学生的学号");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getNumber() == number) {
                studentList.remove(i);
                System.out.println("删除成功！");
                break;
            }
        }
        System.out.println("不存在该学生！");
    }

    public static void changeStudent(ArrayList<student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更改学生的学号：");
        int number = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            student s = studentList.get(i);
            if (s.getNumber() == number) {
                System.out.println("请输入学生姓名：");
                sc.nextLine();
                String name = sc.nextLine();
                s.setName(name);
                System.out.println("请输入学生年龄：");
                s.setAge(sc.nextInt());
                System.out.println("请输入学生学号：");
                s.setNumber(sc.nextInt());
                System.out.println("修改成功！");
            } else {
                System.out.println("不存在该学生！");
            }
        }
    }

}
