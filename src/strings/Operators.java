package strings;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //single coats(' ') = character
        //character are converted into ascii value
        System.out.println("a"+"b"); //double coats = string
        //string are not converted into ascii value
        System.out.println((char)('a'+3));  //will print d using typecasting
        System.out.println("a" + 1);  // same as "a" + "1"
        //integer will be converted to Integer that will call toString
        //any objects we add will call toString method but at least 1 object should be string
        //This is called operator overloading it only works in case of string in Java
    }
}
