package com.practice1.catsanddogs;

public class Cats extends Pets{

    public Cats() {
    }

    public Cats(String name, int age) {
        super(name, age);
    }

    public void getMouse(){
        System.out.println("抓老鼠");
    }

}
