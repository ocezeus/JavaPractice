package com.practice1.String1;

public class StringFemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1"+s1);

        char[] chs ={'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2"+s2);

        byte[] bys = {99,107,122};
        String s3 = new String(bys);
        System.out.println("s3"+s3);

        String s4 = "dsafj";
        System.out.println("s4"+s4);

        System.out.println(s3.equals(s4));
        System.out.println(s3.isEmpty());
    }
}
