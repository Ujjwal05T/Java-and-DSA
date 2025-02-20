package arrays.searching.questions;

public class Floor {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,8,10,10,12,19};
        int target = 5;
        int result = findFloor(arr,target);
        System.out.println(result);
    }
    static int findFloor(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
