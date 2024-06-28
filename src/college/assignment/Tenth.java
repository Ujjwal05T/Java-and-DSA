package college.assignment;

import java.util.Scanner;

class FactCalc {
    int fact =1;
    void calcFact(int num){
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(num +"! = " + fact);
    }
}
public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial:");
        int num = sc.nextInt();
        FactCalc f = new FactCalc();
        f.calcFact(num);
    }
}
