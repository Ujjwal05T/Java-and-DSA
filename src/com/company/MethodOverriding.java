package com.company;
class A {
    void meth1(){
        System.out.println("method 1 of class A");
    }
}
class B extends A {
    @Override  // not necessary but recommended
    void meth1(){
        System.out.println("method 1 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
    B a = new B();
    a.meth1();
    }
}
