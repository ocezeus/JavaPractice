package com.practice1.String1;

public class updateStringfunct {
    public static void main(String[] args) {
        int[] arr = {4,6,4,3,1,7,2,2,3};
        String result = pinjie(arr);


        System.out.println(result);
    }

    public static String pinjie(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        String result = sb.toString();
        return result;
    }
}
