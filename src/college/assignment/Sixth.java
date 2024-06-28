package college.assignment;

public class Sixth {
    public static void main(String[] args) {
        int i;
        int j;
        boolean k=true;
        System.out.print("Prime numbers between 1 to 100 :");
        for (i = 2; i <= 100; i++) {
            k=true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    k=false;
                    break;
                }
            }
            if(k){
                System.out.print(i + " ");
            }
        }
    }
}



