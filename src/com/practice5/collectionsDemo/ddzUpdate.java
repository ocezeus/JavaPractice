package com.practice5.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class ddzUpdate {
    public static void main(String[] args) {
        HashMap<Integer,String> box = new HashMap<Integer,String>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        String[] colors = {"♠","♥","♦","♣"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int id = 0;
        for(String number:numbers){
            for(String color:colors){
                box.put(id,color+number);
                al.add(id);
                id++;
            }
        }
        box.put(id,"BJ");
        al.add(id);
        id++;
        box.put(id,"SJ");
        al.add(id);

        TreeSet<Integer> player1 = new TreeSet<Integer>();
        TreeSet<Integer> player2 = new TreeSet<Integer>();
        TreeSet<Integer> player3 = new TreeSet<Integer>();

        Collections.shuffle(al);

        for(int i = 0;i<al.size();i++){
            if(i%3==0){
                player1.add(al.get(i));
            }else if(i%3==1){
                player2.add(al.get(i));
            }else{
                player3.add(al.get(i));
            }
        }

        look("玩家1",player1,box);
        look("玩家2",player2,box);
        look("玩家3",player3,box);



    }

    public static void look(String name,TreeSet<Integer> pl,HashMap<Integer,String> box){
        System.out.println(name+"手中有：");
//        for(int i = 0;i<pl.size();i++){
//            if(i==pl.size()-1){
//                System.out.println(box.get(pl[i]));
//            }else{
//                System.out.print(box.get(i)+",");
//            }
//        }
        for(Integer card:pl){
            if(card.equals(pl.last())){
                System.out.println(box.get(card));
            }else {
                System.out.print(box.get(card)+",");
            }
        }
    }
}
