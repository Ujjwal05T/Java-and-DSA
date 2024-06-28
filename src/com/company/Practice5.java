package com.company;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        //QUESTION 1
//        for(int i = 4;i!=0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        //Question 2
//        int i,n;
//        int sum=0;
//        i=0;
       Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//        while(i<n){
//           // sum=2*i;
//
//            sum=2*i+sum;
//            i++;
//        }
//        System.out.println(sum);
        //Question 5 Factorial
        int n;
        int f=1;
        n=sc.nextInt();
        for(int i=n;i>0;i--){
           f=(f*i);
          //  System.out.println(f);
        }
        System.out.println(f);
    }
}
