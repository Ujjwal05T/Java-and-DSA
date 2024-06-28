package arrays;

import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                int [][] array = new int [3][3];
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length ; k++) {
                array[j][k]=sc.nextInt();
            }
        }
//        int [][] array = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        //Normal for loop
//        for (int k = 0; k <array.length ; k++) {
//            for (int j = 0; j < array[k].length ; j++) {
//                System.out.print(array[k][j] + " ");
//            }
//            System.out.println();
//        }
        //For each or Enhanced for loop
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
