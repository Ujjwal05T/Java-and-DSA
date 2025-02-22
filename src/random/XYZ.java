package random;

public class XYZ {
    public static void main(String[] args) {
        int num = 1234567;
        String s = String.valueOf(num);
        int n = (int) (Math.log10(num) + 1);
        int length = s.length();
        System.out.println(n);

    }
}
