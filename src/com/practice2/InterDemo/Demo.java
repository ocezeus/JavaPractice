package com.practice2.InterDemo;

public class Demo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.Jump();

        Animal a = new Cat();
        a.setName("mimi1");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        ((Cat) a).Jump();

    }
}
