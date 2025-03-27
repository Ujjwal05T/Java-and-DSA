package recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,5,2,9,19,9};
        //can also use static variable then we also have don't have to pass list as argument
        List<Integer> list=new ArrayList<>();
        int target = 9;
        System.out.println(linear2(arr,target,0,list));
        System.out.println(linear3(arr,target,0));
    }
    static int linear(int [] arr,int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return linear(arr,target,index+1);
    }
    //for all occurrences
    static List<Integer> linear2(int [] arr,int target,int index,List<Integer> list){
        if(arr[index]==target){
            list.add(index);
        }
        if(index==arr.length-1){
            return list;
        }
        return linear2(arr,target,index+1,list);
    }
    //without parameter and outside list
    static List<Integer> linear3(int [] arr,int target,int index){
        List<Integer> list = new ArrayList<>();
        if(arr[index]==target){
            list.add(index);
        }
        //contains answer for single function call
        if(index==arr.length-1){
            return list;
        }
        //adding answers from previous function calls
        list.addAll(linear3(arr,target,index+1));
        return list;
    }
}
