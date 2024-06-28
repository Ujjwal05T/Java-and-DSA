package com.company;
class First{
    int a;

    public int getA() {
        return a;
    }

    public First(int a) {
        this.a = a;
        System.out.println("Constructor of first class "+ this.a);

    }
    void display(){
        System.out.println("waka waka");
    }
}
class Seconds extends First{
    public Seconds(int a) {
        super(a); //calling constructor of parent class prints
        System.out.println("constructor of second class "+this.a + " "+ super.a );
        super.display();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        //can be used to refer immediate parent class variables
        //can be used to invoke parent class methods
        //can be used to invoke parent class constructor
        //sub-class calls constructor of parent class which do not have args automatically if
        // there is any but if we want to call constructor with args we have to use super keyword super(args)
        First a = new First(6);
        Seconds b = new Seconds(9);

    }
}
