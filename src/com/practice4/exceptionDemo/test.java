package com.practice4.exceptionDemo;

public class test {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("你访问的数组索引不存在");
            System.out.println(e.getMessage());
        }

//        return arr;

    }
}
