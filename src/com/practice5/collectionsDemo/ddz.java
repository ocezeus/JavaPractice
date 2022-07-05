package com.practice5.collectionsDemo;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

public class ddz {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        String[] color = {"♠", "♥", "♣", "♦"};

        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String c : color) {
            for (String n : number) {
                al.add(c + n);
            }
        }

        al.add("B-Joker");
        al.add("S-Joker");

        Collections.shuffle(al);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();

        for (int i = 0; i < al.size(); i++) {
            String card = al.get(i);
            if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else {
                player3.add(card);
            }
        }

        look("玩家1", player1);
        look("玩家2", player2);
        look("玩家3", player3);

    }

    public static void look(String name, ArrayList<String> arr) {
//        arr.sort();
        System.out.println(name + "手中有：");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.println(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ",");
            }
        }
    }
}
