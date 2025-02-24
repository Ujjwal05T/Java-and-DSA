package generics;

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
         arr[size]=null;
         return removed;
    }
    public T get(int index){
        return (T)arr[index];
    }
    public void set(int index,T value){
        arr[index]=value;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString() {
        Object [] temp = new Object[size];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        return Arrays.toString(temp);
    }
}
public class Generics {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(9);
        list.add(20);
        list.add(30);
//        list.remove();
        System.out.println(list);

    }
}
