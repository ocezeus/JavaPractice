package com.practice5.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map4 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

        HashMap<String,String> hm1 = new HashMap<String,String>();
        HashMap<String,String> hm2 = new HashMap<String,String>();
        HashMap<String,String> hm3 = new HashMap<String,String>();

        hm1.put("刀哥","刀嫂");
        hm1.put("虎弟","彪子姐");
        hm1.put("西八","八嘎");

        hm2.put("蝈蝻","仙女");
        hm2.put("电动车","广西");
        hm2.put("汽车","马斯克");

        hm3.put("鸿蒙","华为");
        hm3.put("安装","谷歌");
        hm3.put("万物起源","小米");

        list.add(hm1);
        list.add(hm2);
        list.add(hm3);

//        Set<Map.Entry<String,String>> entrySet = hm1.entrySet();
//        bianli(hm1);


        for (Map mp:list){
            Set<Map.Entry<String, String>> entries = mp.entrySet();

            for(Map.Entry entry:entries){
                Object value = entry.getValue();
                Object key = entry.getKey();
                System.out.println(key+","+value);
            }
        }

    }

//    public static void bianli(Map map){
//       Set<Map.Entry<Student, String>> entrySet = map.entrySet();
//
//        map.entrySet().getClass();
//
//    }
}
