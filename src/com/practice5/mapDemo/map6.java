package com.practice5.mapDemo;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        System.out.println("请输入字符串:");
        String input = sc.nextLine();

        for(int i =0;i<input.length();i++){
            char key = input.charAt(i);

            Integer value = hm.get(key);

            if(value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }

        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for(Character key:keySet){
            Integer value = hm.get(key);
            StringBuilder fin = sb.append(key).append("(").append(value).append(")");
        }
        String s = sb.toString();
        System.out.println(s);

//        Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
//
//        for (int i = 0;i<input.length();i++){
//            for(Map.Entry entry:entrySet){
//                Object key = entry.getKey();
//                if(key.equals(input.charAt(i))){
//                    entry.getValue()++;
//                }
//            }
//        }


    }
}
