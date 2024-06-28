package arrays.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear Search Algo
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==s){
                index = i;
            }
        }
        if(index != 0){
            System.out.println("value found at index:" + index);
        }else {
            System.out.println("Not found ");
        }
    }
}
