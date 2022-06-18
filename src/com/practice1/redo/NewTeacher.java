package com.practice1.redo;

public class NewTeacher extends Human{

    public NewTeacher() {
    }

    public NewTeacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("黄金教师");
    }
}
