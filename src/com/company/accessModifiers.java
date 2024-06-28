package com.company;

class myEmployee {
    private int id ;
    private String name;
     String getName() {
        return name;
    }
     void setName(String n){
        name = n;
    }
}
public class accessModifiers {


    public static void main(String[] args) {
        myEmployee ujjwal = new myEmployee();
        ujjwal.setName("Ujjwal Tamrakar");
        System.out.println(ujjwal.getName());
    }
}
