package com.company;

public class varargs {
    static int sum(int...arr){
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 3 and 4 is " + sum(3,4));
    }
}
