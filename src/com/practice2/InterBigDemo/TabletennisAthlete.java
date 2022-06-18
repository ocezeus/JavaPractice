package com.practice2.InterBigDemo;

public class TabletennisAthlete extends Athlete implements SpeakEnglish {
    public TabletennisAthlete() {
    }

    public TabletennisAthlete(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void Study() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void English() {
        System.out.println("学习说英语");
    }
}
