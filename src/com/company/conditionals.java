package com.company;
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
//        System.out.println("the onepiece is real");
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter age:");
//        int a = s.nextInt();
//
//        if(a>18){
//            System.out.println("You can vote");
//        }
//        else {
//            System.out.println("You can't vote");
//        }

        System.out.println("lets start");
        int year = 1000;
        if(year%4 == 0 && year%100 != 0 || year%400 ==0){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }
    }
}

