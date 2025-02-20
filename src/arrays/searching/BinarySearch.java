package arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search Algo
        //Binary search works only on sorted arrays
        //First we find the middle element of the array
        //Then we compare the middle element with the search element
        //If the middle element is equal to the search element then we return the index
        //If the middle element is less than the search element then we search in the right half of the array and left half otherwise
        //We repeat the process until we find the element or the left index is less than the right index
        //Time Complexity: O(log n)
        //If array is sorted in descending order then we can reverse the comparison operators
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int result = binarySearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found");
        }

    }
    //return -1 if element not found
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //better way than start+end/2 to avoid exceeding the integer limit
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
