package com.practice1.api1;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
    }
}
