package com.practice1.String1;

public class Stringbbbb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("nmsl");
        sb.append("battle");
        sb.append("123");

        StringBuilder sb2 = new StringBuilder();

        sb2.append("qs").append("szyd");

        System.out.println(sb);
        System.out.println(sb2);

        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();

        String s1 = sb2.toString();

        StringBuilder s3 = new StringBuilder(s1);

        System.out.println(s);
        System.out.println(s3);
    }
}
