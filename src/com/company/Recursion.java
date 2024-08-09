package com.company;
import java.util.Scanner;
    public class Recursion {
//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }
    static int fibonacci(int n){
//        int a=0;
//        int b=1;
//        int c=0;
//        System.out.print("Fibonacci Series:" + a + " " + b);
//        for(int i=3;i<10;i++){
//            c=a+b;
//            System.out.print("  " + c);
//            a=b;
//            b=c;
//        }
        if(n<=1){                   //using recursion
            return n;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. for calculating factorial:");
        int n = sc.nextInt();
//        System.out.printf("%d! = " + factorial(n),n);
//        System.out.println(" ");
        for (int i =0 ;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
