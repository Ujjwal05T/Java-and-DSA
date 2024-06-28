package com.company;
class Box{
    int a;
    Box(int a){
        this.a=a;
    }
    Box(Box obj){
        this.a=obj.a;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Box a = new Box(3);
        Box b = new Box(a); //passing already created object in constructor
        System.out.println(a.a);
        System.out.println(b.a);
    }
}
