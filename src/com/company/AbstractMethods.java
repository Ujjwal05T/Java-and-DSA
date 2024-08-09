package com.company;
abstract class Parent {
   abstract void display();
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Abstract method");
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
