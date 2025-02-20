package arrays.sorting;

import java.util.Arrays;

import static arrays.sorting.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        //Cyclic sort
        //Time complexity = O(n)
        //Best when given a range
        int [] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int [] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
}
