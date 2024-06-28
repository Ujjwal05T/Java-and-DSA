package com.company;
class soc {
    String name;
    soc(){
        System.out.println("Constructor");
    }
}
class mca extends soc {
    mca(){
        System.out.println("Constructor mca");
    }
    int age;
}
public class inheritance {
    public static void main(String[] args) {
        mca m = new mca();
        m.age=19;
        m.name="Naruto";
        System.out.println(m.age);
        System.out.println(m.name);
    }
}
