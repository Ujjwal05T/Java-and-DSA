package com.company;
class Employee1 {
    private int id ;
    private String name;
    String getName() {
        return name;
    }
    void setName(String n){
        name = n;
    }
    public Employee1(){
        name = "Your Name Here";
//        System.out.println("onepiece");
    }
}
public class constructors {
    public static void main(String[] args) {
    Employee1 ujjwal = new Employee1();
//    Employee1 satyam = new Employee1();

    ujjwal.setName("Ujjwal");
        System.out.println(ujjwal.getName());
    }
}
