package recursion;

public class Q6 {
    //find if an array is sorted or not
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,5,6,7,8};
        System.out.println(checkSorted(arr,0));
    }
    static boolean checkSorted(int [] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& checkSorted(arr,index+1);
    }
}
