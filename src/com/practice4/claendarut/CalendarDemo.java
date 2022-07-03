package com.practice4.claendarut;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

        c.add(Calendar.DATE,6);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

        c.set(2048,12,30);
        int monthh = c.get(Calendar.MONTH)+1;
        System.out.println(monthh);
    }
}
