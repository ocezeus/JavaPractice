package com.practice1.catsanddogs;

public class Dogs extends Pets{

    public Dogs() {
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    public void watcher(){
        System.out.println("看门");
    }
}
