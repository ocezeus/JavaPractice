package com.practice2.mutiSit;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("mimi");
        a.setAge(2);
        System.out.println("name:"+a.getName()+",age:"+a.getAge());
        a.eat();

        a= new Cat("jiji",3);
        System.out.println("name:"+a.getName()+",age:"+a.getAge());
        a.eat();
    }
}
