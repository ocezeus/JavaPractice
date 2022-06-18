package com.practice1.String1;

import java.util.Scanner;

public class times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = sc.nextLine();

        int big = 0;
        int small = 0;
        int number = 0;

        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c>='A' && c<='Z'){
                big++;
            }else if(c>='a'&&c<='z'){
                small++;
            }else if(c>='0'&&c<='9'){
                number++;
            }
        }
        System.out.println("big:"+big+",small:"+small+",number:"+number);
    }
}
