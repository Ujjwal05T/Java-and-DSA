package com.company;
class Box{
    int a=6;
    Box(int a){
        this.a=a;
    }
    Box(Box obj){
        this.a=obj.a;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Box c = new Box(5);
        c=new Box(9);
        Box b = new Box(c); //passing already created object in constructor

        System.out.println(c.a);
        System.out.println(b.a);
    }
}
