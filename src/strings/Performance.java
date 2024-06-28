package strings;

public class Performance {
    public static void main(String[] args) {
       String s ="";
        for (int i = 0; i <26 ; i++) {
            char a = (char) ('a' +i);
            s=s+a;

        }
        System.out.println(s);
        //this have performance issue becoz object is created in each iteration of loop coz strings are immutable so new string is created each time
        //so time complexity is O(n2)
        // to resolve this we use Stringbuilder class
    }
}
