package arrays;

import java.util.Arrays;

class CustomArrayList {
    private int [] arr;
    private int DEFAULT_Size=1;
    private int size=0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_Size];
    }
    public void add(int n){
        if(size==arr.length){
            resize();
        }
        arr[size++]=n;
    }
    public void resize(){
        int temp [] = new int [2* arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
public class CustomList {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(9);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }
}
