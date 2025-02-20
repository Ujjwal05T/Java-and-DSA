package arrays.searching.questions;

public class Ceiling {
    public static void main(String[] args) {
        //Ceiling of a number is the smallest number greater than or equal to the target number
        //In the given array
        int [] arr = {1,2,3,4,8,10,10,12,19};
        int target = 5;
        int result = findCeiling(arr,target);
        System.out.println(result);
    }

    static int findCeiling(int [] arr ,int target){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        return start;
    }
}
