package com.company;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        int a;
        String userInput = "", computer = "";
        int r;
        while (true) {
            System.out.print("Enter 1 for Rock,2 for Paper and 3 for Scissor:");
            a = sc.nextInt();
            r = R.nextInt(4);
            switch (a) {
                case 1:
                    System.out.println("User Choice is Rock");
                    userInput = "Rock";
                    break;
                case 2:
                    System.out.println("User Choice is Paper");
                    userInput = "Paper";
                    break;
                case 3:
                    System.out.println("User Choice is Scissor");
                    userInput = "Scissor";
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
            switch (r) {
                case 1:
                    System.out.println("Computer Choice is Rock");
                    computer = "Rock";
                    break;
                case 2:
                    System.out.println("Computer Choice is Paper");
                    computer = "Paper";
                    break;
                case 3:
                    System.out.println("Computer Choice is Scissor");
                    computer = "Scissor";
                    break;
            }
            if (userInput.equals(computer)) {
                System.out.println("Draw");
            }
            if (userInput.equals("Rock")) {
                if (computer.equals("Scissor")) {
                    System.out.println("User Wins");
                } else if (computer.equals("Paper")) {
                    System.out.println("Computer Wins");
                }
            }
            if (userInput.equals("Paper")) {
                if (computer.equals("Rock")) {
                    System.out.println("User Wins");
                } else if (computer.equals("Scissor")) {
                    System.out.println("Computer Wins");
                }
            }
            if (userInput.equals("Scissor")) {
                if (computer.equals("Paper")) {
                    System.out.println("User Wins");
                } else if (computer.equals("Rock")) {
                    System.out.println("Computer Wins");
                }
            }
        }
    }
}
