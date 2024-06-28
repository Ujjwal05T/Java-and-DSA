package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{
    int num;
    int userInput;
    int noOfGuesses=0;
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    boolean isCorrectNum () {
        if(userInput==num){
            return true;
        }else if(userInput>num) {
            System.out.println("Your guess is bigger than num");
            return false;
        }else {
            System.out.println("Your guess is lower than num");
            return false;
        }
    }
    public Game() {
        Random r = new Random();
        num = r.nextInt(100);
    }
}
public class guessTheNumber {
    public static void main(String[] args) {
        boolean loop=true;
       Game g = new Game();
       while(loop){
           System.out.print("Enter your guess:");
           g.takeUserInput();
           if(g.isCorrectNum()){
               System.out.println("You guessed Right");
               g.noOfGuesses++;
               loop = false;
               System.out.println("No. of guesses " + g.noOfGuesses);
           }
           else {
               System.out.println("You guessed Wrong try again");
               g.noOfGuesses++;
           }
       }
    }
}
