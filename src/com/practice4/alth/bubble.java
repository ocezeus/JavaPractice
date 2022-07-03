package com.practice4.alth;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13,45,32,77,2,4};
        System.out.println("排序前："+arrayToString(arr));
        System.out.println("排序后："+compare(arr));



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

    public static String compare(int[] arr){
        int sw = 0;
        int end = arr.length-1;
        for (int j =arr.length-1;j>0;j--){
            for(int i = 0;i<end;i++){
                if(arr[i]>arr[i+1]){
                    sw = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = sw;
                }
            }
            end--;
        }
        String s = arrayToString(arr);
        return s;
    }
}
