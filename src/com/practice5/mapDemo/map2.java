package com.practice5.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<Integer,Student>();

        Student s1 = new Student("刀哥",23);
        Student s2 = new Student("虎弟",34);
        Student s3 = new Student("嘉然",69);

        map.put(001,s1);
        map.put(002,s2);
        map.put(003,s3);

        Set<Map.Entry<Integer, Student>> entries = map.entrySet();

        for(Map.Entry entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }



    }
}
