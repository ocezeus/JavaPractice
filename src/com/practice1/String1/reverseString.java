package com.practice1.String1;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String input = sc.nextLine();

        String result ;
        result = reverse(input);
        System.out.println(result);
    }

    public static String reverse(String input) {
        String reversed = "";

        for (int i = input.length()-1; i >=0; i--) {
                reversed += input.charAt(i);
        }
        return reversed;
    }
}
