package college.assignment;

import java.util.Scanner;

public class Ninth {
    static void isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Entered year is leap year");
        } else {
            System.out.println("Entered year is not leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check if it is leap:");
        int year = sc.nextInt();
        isLeap(year);
    }
}
