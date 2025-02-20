package arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Bubble sort
        //Repeatedly swap the adjacent elements if they are in wrong order
        //In each iteration largest element is sorted
        //Time Complexity=O(n^2) ; worst case
        // o(n) ; best case
        int [] arr = {2,3,8,2,5,8,1};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }
            //if not swapped than break
            if(!swapped){
                break;
            }
        }
    }
}
