package com.practice4.dateprac;

import java.text.ParseException;
import java.util.Date;

public class DUDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String format = "yyyy年MM月dd日 HH:mm:ss";

        String s1 = DateUtils.dateToString(d, format);
        System.out.println(s1);

        String input = "2022年06月24日 23:55:13";
        Date dd = DateUtils.stringToDate(input, format);
        System.out.println(dd);
    }
}
