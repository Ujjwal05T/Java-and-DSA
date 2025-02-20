package strings;

import java.util.Arrays;

public class PrintStreamClass {
    public static void main(String[] args) {
        System.out.println(56); //out is a variable of type Prinstream , which contains println method
        //Anything You print using println it calls valueof method which calls toString method
        System.out.println(new int[]{1,2,3}); //uses default toString method
        System.out.println(Arrays.toString(new int[]{1,2,3})); // uses overriden toString method from Arrays class

        //if we print array or any object directly println wil call valueOf which will call toString method ; this will be default toString method
        //which will print a hash value in case of array or object (example in printstreamclass.java)
        //to avoid this we call Arrays.toString in case of array to print string representation of array
    }
}
