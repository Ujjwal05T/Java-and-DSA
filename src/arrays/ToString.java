package arrays;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        //ToString method of arrays
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));  //Returns String representation of array

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < a.length ; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        for(int[] index:a){
            System.out.println(Arrays.toString(index));
        }
    }
}
