package random;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        long num = 0;
        if(digits[n-1]==9){
            for(int i = 0;i<n;i++){
                num = num + digits[i];
                num = num*10;
            }
            num  = (num/10) + 1;

//            int digitCount = (int) Math.log10(num) + 1;
            int digitCount = Long.toString(num).length();
            int [] arr = new int[digitCount];
            for(int i = digitCount-1;i>=0;i--){
                arr[i] = (int) num % 10;
                num = num/10;
            }
            return arr;

        }else{
            ++digits[n-1];
        }
        return digits;
    }
}
