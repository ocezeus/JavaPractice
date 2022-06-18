package com.practice1.redo;

public class TestDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(33);
        t.setName("doctor");
        System.out.println(t.getName()+","+t.getAge());
        t.teach();

        Teacher t1 = new Teacher("nurse",43);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

    }
}
