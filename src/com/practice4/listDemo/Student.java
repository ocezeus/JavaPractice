package com.practice4.listDemo;

public class Student {
    private String nane;
    private int age;

    public Student() {
    }

    public Student(String nane, int age) {
        this.nane = nane;
        this.age = age;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nane='" + nane + '\'' +
                ", age=" + age +
                '}';
    }
}
