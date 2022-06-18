package com.practice2.InterBigDemo;

public class BasketCoach extends Coach{
    public BasketCoach() {
    }

    public BasketCoach(String name,int age) {
        super(name,age);
    }

    @Override
    public void Teach(){
        System.out.println("教篮球");
    }
}
