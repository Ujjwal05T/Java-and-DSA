package college.assignment;

public class Third {
    static boolean isPrime(int num){
        boolean k;
        k=true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                k=false;
                break;
            }
        }
        if(k){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int sum = 0;
        int i=2;
        while(i<50){
            if(isPrime(i)){
                sum=sum +i;
            }
            i++;
        }
        System.out.println("The sum of prime numbers from 1 to 50 is " + sum);
    }
}
