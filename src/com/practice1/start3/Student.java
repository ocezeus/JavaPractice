package com.practice1.start3;

public class Student {
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
