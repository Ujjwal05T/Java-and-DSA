package bitwise;

public class Q2 {
    // Find the number that is not repeated in the array
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,5,4,3,2};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println("The number that is not repeated in the array is: " + ans);
    }
}
