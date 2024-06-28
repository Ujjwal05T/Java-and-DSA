package com.company;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {;
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Press 1 for A");
        System.out.println("Press 2 for B");
        System.out.println("Press 3 for C");
        System.out.print("Enter your choice:");
        a = s.nextInt();
        switch (a) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("C");
            default -> System.out.println("Wrong choice");
        }
    }
}

