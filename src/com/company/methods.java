package com.company;

public class methods {
    static void quote(){
        System.out.println("The Onepiece is real");
    }
    static void quote(int a){
        System.out.println("The onepiece is real " + a);
    }
    static void quote(int a,int b){
        System.out.println(a+" Uzumaki Naruto "+b);
    }
    public static void main(String[] args) {
        quote();
        quote(1);
        quote(2,3);

    }
}
