package recursion;

public class Q2 {
    //sum of digits of a number
    public static void main(String[] args) {
        int num = 505;
        System.out.println(digitsSum(num));
    }
    static int digitsSum(int num){
        if(num % 10 == num){
            return num;
        }
        return (num%10)+digitsSum(num/10);
    }
}
