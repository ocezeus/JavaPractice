package com.practice1.start;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name+","+s.age);
        s.name = "虎哥";
        s.age = 87;

        System.out.println(s.name+","+s.age);

        s.doHomework();
        s.study();

        Student s2 = new Student();
        System.out.println(s2.name+","+s2.age);

        s2.age = 56;
        s2.name = "刀醬";

        System.out.println(s2.name+","+s2.age);

        s2.study();
        s2.doHomework();

    }
}
