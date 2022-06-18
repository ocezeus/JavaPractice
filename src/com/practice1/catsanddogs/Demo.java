package com.practice1.catsanddogs;

public class Demo {
    public static void main(String[] args) {
        Cats mimi = new Cats();
        mimi.setAge(1);
        mimi.setName("mimi");
        System.out.println("name:"+mimi.getName()+",age:"+mimi.getAge());
        mimi.getMouse();

        Cats jiji = new Cats("jiji",5);
        System.out.println("name:"+jiji.getName()+",age:"+jiji.getAge());
        jiji.getMouse();
    }
}
