package college.assignment;
import java.util.Scanner;
public class Fifth {
    static void calcArea(float r){
        double area = 3.14 * r * r;
        System.out.println("Area of circle:" + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle:");
        float radius = sc.nextFloat();
        calcArea(radius);
    }
}
