package com.practice4.alth;

import java.util.Arrays;
import java.util.Scanner;

public class strsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要排序的数列并以空格分割：");
        String input = sc.nextLine();

        String[] s = input.split(" ");

        int[] arr = new int[s.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(arr);
        System.out.println(arrayToString(arr));
//        System.out.println(bubbbbb(arr));
//        for(int i =0;i<s.length;i++){
//            System.out.print(s[i]);
//        }

    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }

    public static String bubbbbb(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String out = arrayToString(arr);
        return out;
    }

}
