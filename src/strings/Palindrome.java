package strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //palindrome means it should be same when reading it start and end ex - "abcdcba"
        //This program is also solution for TCS question for palindrome
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s.toLowerCase()));
    }
    static boolean checkPalindrome(String s){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<=122 && s.charAt(i)>=65){
                builder.append(s.charAt(i));
            }
        }
        for (int i = 0,j=builder.length()-1; i < builder.length()/2; i++,j--) {
            if(builder.charAt(i)!=builder.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
