package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        //Question 2
//       int [] array = {1,2,3,4,5,6};
//       int j=0;
//       Scanner sc = new Scanner(System.in);
//       int num = sc.nextInt();
//       for(int i=0;i<array.length;i++){
//           if(num==array[i]){
//               System.out.println(num + " is present in the array");
//               j++;
//        break;
//           }
//       }
//       if(j==0){
//           System.out.println(num + " is not present in the array");
//       }
        //Question 3
//        int [] marks = {78,87,96,76,90};
//        int sum =0;
//        float avg;
//        for(int element:marks){
//            sum += element;
//        }
//        avg = (float)sum/marks.length;
//        System.out.println(sum);
//        System.out.println(avg);
        //Question 4
//        int [][] m1 = {{1, 2,3},
//                {2,3,4},
//        };
//        int [][] m2 = {{4,5,6},
//                {7,8,9},
//        };
//        int sum = 0;
//        for(int i=0;i< m1.length;i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                System.out.print(m1[i][j] + m2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(""); }
        //Question 5
//        int[] arr = {1, 2, 3, 4, 5,6,7,8};
//        int n = Math.floorDiv(arr.length, 2);
//        int l = arr.length;
//        int temp;
//        for (int i = 0; i < n; i++) {
//            temp = arr[i];
//            arr[i] = arr[l - 1 - i];
//            arr[l - 1 - i] = temp;
//        }
//        for (int element : arr){
//            System.out.print(element+" ");
//    }
        //Question 6 and 7
        int [] arr = {1,5,76,33,4,2};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }

        }
        System.out.println(max);
        //Question 8
//        int [] arr = {1,2,3,4,5,6};
//        boolean isSorted = true;
//        for(int i=0;i<arr.length-1;i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//            }
//        }
//            if(isSorted){
//                System.out.println("sorted");
//            }else {
//                System.out.println("Not Sorted");
//            }

    }
}
