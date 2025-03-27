package recursion;

import static recursion.Q3.reverse;

public class Q4 {
    //palindrome number
    public static void main(String[] args) {
        int num = 787;
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return (num==reverse);
    }
}
