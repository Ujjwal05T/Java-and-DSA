package arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        arr[0]=6;
//        System.out.println(arr[1]); // output 0 for primitive
//        String [ ] arr = new String[2];
//        System.out.println(arr[0]);  //output null for non primitive
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int index: arr){    //for each loop
            System.out.print(index + " ");    //for every element in array print the element
        }

    }
}
