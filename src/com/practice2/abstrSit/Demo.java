package com.practice2.abstrSit;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat("mimi",3);
        System.out.println(a.getName()+a.getAge());
        a.eat();
    }
}
