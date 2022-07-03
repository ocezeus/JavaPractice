package com.practice4.claendarut;

import java.util.Calendar;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要获取的年份：");

        Calendar c = Calendar.getInstance();
        int year = sc.nextInt();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年的2月有"+date+"天");




    }
}
