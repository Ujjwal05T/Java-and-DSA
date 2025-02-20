package arrays.sorting;

import java.util.Arrays;

import static arrays.sorting.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        //Time Complexity = O(n^2) worst case
        //O(n) best case
        int [] arr = {1,3,5,2,4,9,6,5,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}
