package recursion;

public class Q3 {
    //reverse a number
    public static void main(String[] args) {
        int num = 60078;
        System.out.println(reverse(num));
    }
    static int reverse1(int num){
        int reverse = 0;
        while(num!=0){
         reverse= (reverse + (num%10))*10;
         num=num/10;
        }
        reverse = reverse/10;
        return reverse;
    }
    //way 1 using recursion
    static int rev = 0;
    static void reverse2(int n){

        if(n==0){
            return;
        }
        rev = rev * 10 + n % 10;
        reverse(n/10);
    }
    //way2 using recursion and helper function
    static int reverse(int n){
        int digits = (int) (Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return (int)(rem * Math.pow(10,digits-1) + helper(n/10,digits-1));
    }
}
