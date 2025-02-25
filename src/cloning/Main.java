package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("A", 1);
        Student s2 =(Student) s1.clone();
        //clone returns object of Object class so we typecast it.
        s2.arr[0]=100;
        //this will change the value of s1 as well in case of shallow copy
        System.out.println(Arrays.toString(s1.arr));
        System.out.println(Arrays.toString(s2.arr));
    }
}
