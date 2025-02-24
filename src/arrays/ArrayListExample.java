package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Arraylist is used to create an array when we don't know how many elements it will have
        //Below is syntax to create arraylist
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(45);    //add method adds element passed in it into the arraylist
        list.add(456);
        list.add(123);

        System.out.println(list);  //automatically uses toString method
        System.out.println(list.contains(45));  //returns true if it contains the element else false
        list.set(0,99);  //updates the value of 0th index to 99
        list.remove(2);
        System.out.println(list);
        //Taking user input
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 5 ; i++) {
            list.add(sc.nextInt());
        }
        //Output another method
        for (int i = 0; i < 7; i++) {
            System.out.println(list.get(i));   //returns the value at ith index
        }
    }
}
