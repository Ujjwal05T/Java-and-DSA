package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fiboFormula(50));
    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    //fibonacci number using formula using golden ratio
    static long fiboFormula(int n){
        double val = (1 + Math.sqrt(5))/2;
        return (long) (Math.pow(val,n)/Math.sqrt(5));
    }
}
