package college.assignment;
class Calculator {
    void add (int x,int y){
        System.out.printf("Sum of %d and %d is %d",x,y,x+y);
    }
    void add(int x, int y, int z){
        System.out.printf("\nSum of %d,%d and %d is %d",x,y,z,x+y+z);
    }
    void subt(int x,int y){
        System.out.printf("\nSubstraction of %d and %d is %d",x,y,x-y);
    }
    void subt(int x,int y,int z){
        System.out.printf("\nSubstraction of %d,%d and %d is %d",x,y,z,x-y-z);
    }
    void mul (int x,int y){
        System.out.printf("\nMultiplication of %d and %d is %d",x,y,x*y);
    }
    void mul(int x,int y,float z){
        System.out.printf("\nMultiplication of %d,%d and %.2f is %.2f",x,y,z,x*y*z);
    }
    void div (int x,int y){
        System.out.printf("\nDivision of %d and %d is %d",x,y,x/y);
    }
    void div(float z,int y){
        System.out.printf("\nDivision of %.2f and %d is %.2f",z,y,z/y);
    }
}
public class Eleventh {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2,5);
        c.add(2,3,4);
        c.div(2.3f,5);
        c.mul(3,1,4.5f);
        c.subt(9,4,2);
    }
}
