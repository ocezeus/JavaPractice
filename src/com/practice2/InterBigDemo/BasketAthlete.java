package com.practice2.InterBigDemo;

public class BasketAthlete extends Athlete {
    public BasketAthlete() {
    }

    public BasketAthlete(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void Study() {
        System.out.println("学习篮球");
    }
}
