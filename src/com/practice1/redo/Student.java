package com.practice1.redo;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public void study(){
        System.out.println("疯狂吸入");
    }
}
