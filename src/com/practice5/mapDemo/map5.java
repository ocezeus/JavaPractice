package com.practice5.mapDemo;

import javafx.scene.shape.TriangleMesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        ArrayList<String> al3 = new ArrayList<String>();

        al1.add("刀哥");
        al1.add("虎弟");
        al1.add("嘉然");

        al2.add("策划");
        al2.add("程序员");
        al2.add("魔法");

        al3.add("倒塌");
        al3.add("哈巴");
        al3.add("可擦");

        hm.put("抽象组合", al1);
        hm.put("互联网", al2);
        hm.put("胡说", al3);

        Set<Map.Entry<String, ArrayList<String>>> entrySet = hm.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            System.out.println(entry.getKey());
            ArrayList<String> li = entry.getValue();
            for(String s: li){
                System.out.println("\t"+s);
            }
        }


    }
}
