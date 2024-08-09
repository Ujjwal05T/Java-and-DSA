package com.company;

import java.util.Arrays;
//Generics are used for type safety ,
class CustomArrayList<T> {
    private Object [] arr;
    private int DEFAULT_Size=1;
    private int size=0;

    public CustomArrayList() {
        this.arr = new Object[DEFAULT_Size];
    }
    public void add(T n){
        if(size==arr.length){
            resize();
        }
        arr[size++]=n;
    }
    public void resize(){
           Object temp [] = new Object [2* arr.length];
           for(int i=0;i<arr.length;i++){
               temp[i]=arr[i];
           }
           arr=temp;
    }
    public T remove(){
         T removed =(T)(arr[--size]);
         return removed;
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
public class Generics {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(9);
        list.add(20);
        list.add(30);
        list.remove();
        System.out.println(list);

    }
}
