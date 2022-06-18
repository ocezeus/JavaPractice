package com.practice1.String1;

import java.util.Scanner;

public class userLoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String username = sc.nextLine();

            System.out.println("请输入密码：");
            String password = sc.nextLine();

            userLogin login = new userLogin(username,password);
        }

    }
}
