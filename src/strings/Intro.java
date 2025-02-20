package strings;

public class Intro {
    public static void main(String[] args) {
        // Every string we create is object of type String
        //String Pool is just separate memory structure for string in heap
        //inside this pool all similar values of string are not recreated
        String a = "Ujjwal"; //Object is created inside string pool
        // == operator will return true if object(reference) of two strings is same and stored in string pool
        String b = "Ujjwal"; //b will also point to same object as a coz value is same
        System.out.println(a==b);
        String s = new String("One piece"); //Object is created outside string pool in heap memory
        String t = new String("One piece"); //creates different object even if object of same value already exists
        // == operator will return false if object(reference) of two strings is same but not stored in string pool
        System.out.println(s==t);       // checks reference of object
        System.out.println(s.equals(t)); //checks value

    }
}
