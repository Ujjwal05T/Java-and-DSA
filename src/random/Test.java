package random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int getMaxSum(int [] arr,int k){
        int sum=0;
        int max_sum=0;
        ArrayList <Integer> sub_list = new ArrayList<>(1);

        for (int i = arr.length-1; i >= 0 ; i--) {
            sum=0;
            sub_list.clear();
            for (int j = 0; j <= i ; j++) {
                sub_list.add(arr[j]);
            }
            if(sub_list.size()>=k){
                for (int j = 0; j < sub_list.size(); j++) {
                    sum=sum+sub_list.get(j);
                }
            }
            if(max_sum<sum){
                max_sum=sum;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            sum=0;
            sub_list.clear();
            for (int j = 0; j <= i ; j++) {
                sub_list.add(arr[j]);
            }
            if(sub_list.size()>=k){
                for (int j = 0; j < sub_list.size(); j++) {
                    sum=sum+sub_list.get(j);
                }
            }
            if(max_sum<sum){
                max_sum=sum;
            }
        }
        System.out.println(max_sum);
        return max_sum;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of list:");
        size= sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter number in the list:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int [] newList = new int[size-1];
        int k = arr[size-1];
        for (int i = 0; i < size-1; i++) {
            newList[i]=arr[i];
        }
        int max=getMaxSum(newList,k);
        System.out.println(max);
    }
}
