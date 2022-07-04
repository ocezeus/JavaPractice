package com.practice5.mapDemo;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
//        Map<String,String> mp = new HashMap<String,String>();
//
//        mp.put("abstract01","刀哥");
//        mp.put("abstract02","虎弟");
//        mp.put("abstract03","阿扣");
//
//        System.out.println(mp);
//
//        mp.remove("abstract01");
//
//        System.out.println(mp);
//
//        boolean a = mp.containsKey("abstract02");
//        System.out.println(a);
//
//        mp.clear();
//        System.out.println(mp);
//        System.out.println(mp.isEmpty());
//        System.out.println(mp.size());

        Map<String,String> map = new HashMap<String,String>();

        map.put("ab01","虎弟");
        map.put("ab02","刀哥");
        map.put("ab03","嘉然");
        map.put("ab04","小圆");
        map.put("ab05","小圆");

//        System.out.println(map);
//
//        boolean xy = map.containsValue("小圆");
//        System.out.println(xy);
//        System.out.println(map.size());
//
//        System.out.println(map.get("ab04"));
//
//        Set<String> keySet = map.keySet();
//        Collection<String> values = map.values();
//        System.out.println(keySet);
//        System.out.println(values);

        Set<String> set = map.keySet();

        for(String s:set){
            String value = map.get(s);
            System.out.println(s+","+value);
        }

        System.out.println("-------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
