package patterns;

public class Stars {
    public static void main(String[] args) {
//        pattern2(5);
//        pattern3(5);
//        pattern4(4);
        pattern5(5);
    }
    static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern3(int n){
        for(int i = 0;i<=n;i++){
            for(int j = n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row ;
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
