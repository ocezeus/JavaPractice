package com.practice2.InterBigDemo;

public class TabletennisCoach extends Coach implements SpeakEnglish{
    public TabletennisCoach() {
    }

    public TabletennisCoach(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void Teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void English() {
        System.out.println("说英文");
    }
}
