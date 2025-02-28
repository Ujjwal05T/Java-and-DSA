package recursion;

public class Intro {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        //base condition to stop recursion
        if(n>=5){
            return;
        }
        //tail recursion
        print(n+1);   //recursive call
    }
}
