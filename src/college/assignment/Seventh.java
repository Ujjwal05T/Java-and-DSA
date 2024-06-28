package college.assignment;
import java.util.Scanner;
public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to be reverse:");
        int num = sc.nextInt();
        System.out.printf("Reveserd number of %d is:",num);
        int reverse=0;
        while(num!=0){
           reverse = reverse*10 + num%10;
           num=num/10;
        }
        System.out.print(reverse);
    }
}
