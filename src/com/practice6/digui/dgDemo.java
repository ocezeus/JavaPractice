package com.practice6.digui;

public class dgDemo {
    public static void main(String[] args) {
        int f = f(20);
        System.out.println(f);
    }

    public static int f(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }

    }
}
