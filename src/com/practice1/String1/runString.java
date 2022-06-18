package com.practice1.String1;

import java.util.Scanner;

public class runString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String s = sc.nextLine();

        for(int i = 0;i<s.length();i++){
            if(i==s.length()-1){
                System.out.println(s.charAt(i));
            }else System.out.print(s.charAt(i)+",");
        }
    }
}
