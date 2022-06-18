package com.practice1.redo;

public class NewDemo {
    public static void main(String[] args) {
        NewTeacher t = new NewTeacher();
        t.setName("huge");
        t.setAge(22);
        System.out.println("name:"+t.getName()+",age:"+t.getAge());
        t.teach();

        NewTeacher tt = new NewTeacher("dadada",65);
        System.out.println("name:"+tt.getName()+",age:"+tt.getAge());
        tt.teach();


    }
}
