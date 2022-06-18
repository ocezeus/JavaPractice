package com.practice1.String1;

import java.util.Scanner;

public class reverseStringSpuer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");

        StringBuilder input = new StringBuilder(sc.nextLine());
        String result = reverse(input);
        System.out.println(result);
    }

    public static String reverse(StringBuilder input) {

        String result = input.reverse().toString();
        return result;
    }
}