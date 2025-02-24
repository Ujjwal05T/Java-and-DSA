package generics;

import java.util.ArrayList;
import java.util.function.Consumer;
interface Operation{
    int operation(int a,int b);
}
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        //for each here works same like map method in js
        //accepts a function that takes an argument from array and runs for each element in the array/list

//        list.forEach((item)-> System.out.println(item * 2));
//        list.forEach((i)-> System.out.println(1));
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        list.forEach(fun);
        int [] arr ={1,2,3,4,5};

        //here Operation has only 1 method that's why we can use it like this.
        //it is called functional interface
        Operation sum = (a,b)->a+b;
        System.out.println(sum.operation(3,4));
    }
    static int sum(int a, int b){
        return a+b;
    }
}
