package com.company;

import java.util.Scanner;
// Average of 5 marks

public class question {
    public static void main(String[] args) {
        System.out.println("Enter marks:");
        Scanner s= new Scanner(System.in);
        System.out.print("Maths Marks:");
        int a=s.nextInt();
        System.out.print("Physics Marks:");
        int b=s.nextInt();
        System.out.print("Chemistry Marks:");
        int c=s.nextInt();
        System.out.print("Hindi Marks:");
        int d=s.nextInt();
        System.out.print("English Marks:");
        int e=s.nextInt();
        float avg = (a+b+c+d+e)/5;
        System.out.print("Average=");
        System.out.println(avg);


    }
}
