package arrays.searching;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        //When we don't know the order of the array(it can be sorted in ascending or descending order)
        //We can find the order of the array by comparing the first and last element of the array
        //If the first element is less than the last element then the array is sorted in ascending order otherwise in descending order
        //Then we can apply binary search accordingly
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        int result = OrderAgnosticBS(arr2,target);
        if(result!=-1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found");
        }

    }
    static int OrderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end]; //to check if the array is sorted in ascending order or not
        while(start<=end){
            //better way than start+end/2 to avoid exceeding the integer limit
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;

    }
}
