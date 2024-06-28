package strings;

import java.util.Arrays;

public class PrintStreamClass {
    public static void main(String[] args) {
        System.out.println(56); //out is a variable of type Prinstream , which contains println method
        //Anything You print using println it calls valueof method which calls toString method
        System.out.println(new int[]{1,2,3}); //uses default toString method
        System.out.println(Arrays.toString(new int[]{1,2,3})); // uses overriden toString method from Arrays class
    }
}
