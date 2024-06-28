package com.company;

class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My Id is " + id);
        System.out.println("My name is " + name);
    }
}
public class OOPs {
    public static void main(String[] args) {
     Employee harry = new Employee();
     Employee my = new Employee();
     harry.id =12;
     harry.name="CodeWithHarry";
     my.id=05;
     my.name="ujjwal Tamrakar";
        my.printDetails();
       harry.printDetails();
    }
}
