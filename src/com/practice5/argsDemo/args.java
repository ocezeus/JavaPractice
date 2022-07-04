package com.practice5.argsDemo;


public class args {
    public static void main(String[] args) {
        Integer sum = sum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static Integer sum(Integer...a){
        Integer sum = 0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}
