package com.practice5.genericDemo;

import java.util.ArrayList;
import java.util.List;

public class genericDe {
    public static void main(String[] args) {
//        List<?> l1 = new ArrayList<Integer>();

        List<?> li = new ArrayList<Integer>();
        List<?> li1 = new ArrayList<String>();
        List<?> li2 = new ArrayList<Object>();
        System.out.println("------------");

        List<? extends Object> lli = new ArrayList<Number>();
    }
}
