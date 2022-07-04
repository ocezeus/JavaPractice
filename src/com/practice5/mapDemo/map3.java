package com.practice5.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map3 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<Student,String>();

        Student s1 = new Student("刀哥",23);
        Student s2 = new Student("虎弟",34);
        Student s3 = new Student("嘉然",69);
        Student s4 = new Student("嘉然",69);

        map.put(s1,"翻斗花园");
        map.put(s2,"沈阳大街");
        map.put(s3,"哔哩哔哩");
        map.put(s4,"哔哩哔哩");

        Set<Map.Entry<Student, String>> entrySet = map.entrySet();

        for(Map.Entry entry:entrySet){

            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+","+value);

        }


    }
}
