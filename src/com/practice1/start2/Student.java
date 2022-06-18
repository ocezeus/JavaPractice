package com.practice1.start2;

public class Student {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    String name;

    public void show() {
        System.out.println(age + "，" + name);
    }
}
