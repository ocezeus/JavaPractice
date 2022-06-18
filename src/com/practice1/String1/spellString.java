package com.practice1.String1;

public class spellString {
    public static void main(String[] args) {
        int[] arr={4,6,4,3,1,7,2,2,3};
        String result ;
        result = backString(arr);
        System.out.println(result);
    }

    public static String backString(int[] arr){
        String s ="[";

        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];
            }else {
                s+=arr[i];
                s+=",";
            }

        }

        s +="]";

        return s;
    }
}
