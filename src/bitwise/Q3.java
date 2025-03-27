package bitwise;

public class Q3 {
    //Get the ith bit
    public static void main(String[] args) {
        int num = 67;
        int i =6;
        int bit = num & (1 << i);
        System.out.println("Bit at position " + i + " is: " + bit);
    }
}
