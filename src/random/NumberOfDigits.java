package random;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 1234567;
        int len = (int) (Math.log10(num) + 1);
        int length = String.valueOf(num).length();
        System.out.println(length);
        System.out.println(len);
    }
}
