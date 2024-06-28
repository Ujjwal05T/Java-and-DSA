package college.assignment;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No.:");
        int num = sc.nextInt();
        System.out.printf("Multiplication Table of %d:",num);
        for (int i=1;i<=10;i++){
            System.out.printf("\n%d x %d = %d",num,i,num*i);
        }
    }
}
