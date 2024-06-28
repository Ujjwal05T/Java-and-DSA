package com.company;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //Exception Handling
//        int a =9;
//        int b= 0;
//        int c = a/b;
//        System.out.println(c); // Throws Error
//        try{
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Can't divide  the given numbers , Reason-");
//            System.out.println(e);
        //Multiple Exceptions
        int [] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = sc.nextInt();
        try{
            System.out.println(arr[i]);
            System.out.println(arr[i]/num);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
