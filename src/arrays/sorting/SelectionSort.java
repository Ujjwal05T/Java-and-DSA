package arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //Selection sort
        //Find the minimum element in unsorted array and swap it with element at beginning or vice versa
        //Time complexity = o(n^2) best & worst case
        int [] arr = {2,3,8,2,5,8,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){

        for (int i = 0; i < arr.length ; i++) {
            int maxIndex = getMaxIndex(arr,0, arr.length-1-i);
            swap(arr,maxIndex, arr.length-i-1);
        }
    }
    static void swap(int [] arr ,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int getMaxIndex(int [] arr,int start,int end){
        int max =0;
        for (int j = start; j <= end ; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
}
