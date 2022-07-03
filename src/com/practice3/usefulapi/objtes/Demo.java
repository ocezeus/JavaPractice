package com.practice3.usefulapi.objtes;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("钻石刀哥哥",23);
        Student s2 = new Student("钻石刀哥哥",23);

        System.out.println(s1.toString() == s2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println(s1.equals(s2));
    }
}
