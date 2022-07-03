package com.practice4.alth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datettt {
    public static void main(String[] args) throws ParseException {
//        Date dt = new Date();
//        System.out.println(dt);
//
//        long date = 1000*60*60*18;
//        Date ddt = new Date(date);
//        System.out.println(ddt);
//        long tm = dt.getTime()/1000/60/60/24/365;
//        System.out.println((dt.getTime()/1000/60/60/24/365.2422-tm)*12);
//
//        Date dt = new Date();
//
//        long time = System.currentTimeMillis();
//        dt.setTime(time);
//
//        System.out.println(dt);
        Date dt = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dt);
        String s = sdf.format(dt);
        System.out.println(s);
        System.out.println("-------------------");

        String ss = "2222-04-21 12:11:54";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dtt = sdf2.parse(ss);
        System.out.println(dtt);
    }
}
