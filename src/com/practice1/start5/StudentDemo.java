package com.practice1.start5;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("黄金巴哈");
        s.setAge(90);
        s.show();

        Student s1 = new Student(33);
        s1.show();

        Student s2 = new Student("白银哈巴");
        s2.show();

        Student s3 = new Student(56,"青铜哈哈");
        s3.show();
    }
}
