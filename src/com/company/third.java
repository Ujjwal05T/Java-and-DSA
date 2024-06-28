package com.company;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
       System.out.println("Taking input from user");
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no.");
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.print("The sum of 2 no. is :");
        System.out.println(a);

    }
}
