package com.practice3.inside3;

public class Outer {
    private int num = 10;

    public void method(){

        class Inner{
            public void shw(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.shw();

    }
}
