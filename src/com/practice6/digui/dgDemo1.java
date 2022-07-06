package com.practice6.digui;

public class dgDemo1 {
    public static void main(String[] args) {
        int result = f(5);
        System.out.println(result);
    }

    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
