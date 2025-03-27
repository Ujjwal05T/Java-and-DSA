package questions;

import java.util.Scanner;

public class TCSquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(minimumOperations(P,Q,R));
    }
    private static int minimumOperations(int p, int q, int r) {
        int count = 0;
        if(p == q && q ==r){
            return 0;
        }
        int num1;
        int max;
        if(p==q) {
            num1 = p;
            max = r;
        }
        else if(r==q){
            num1 = r;
            max = p;
        }
        else if(r==p) {
            num1 = r;
            max = p;
        }else{
            return -1;
        }
        while( num1 < max){
            num1++;
            max--;
            count++;
         if(num1 == max){
             return count;
         }
        }
        return -1;
    }
}
