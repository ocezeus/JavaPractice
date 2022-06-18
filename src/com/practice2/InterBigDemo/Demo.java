package com.practice2.InterBigDemo;

public class Demo {
    public static void main(String[] args) {
        TabletennisAthlete t1 = new TabletennisAthlete("马龙",30);
        System.out.println(t1.getName()+t1.getAge());
        t1.eat();
        t1.English();
        t1.Study();
    }
}
