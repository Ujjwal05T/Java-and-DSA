package recursion;

public class Q1 {
    //Sum of nums from 1 to n
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println("Sum of 1 to 5 is: " + sum);
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
