    package college.assignment;

    import java.util.Scanner;

    public class Fifteenth {
        public static void main(String[] args) {
            int [] arr = {10,500,500,363,400,2};
            int max=Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if (arr[i]>max) {
                    max = arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>secMax && arr[i]!=max){
                    secMax=arr[i];
                }
            }
           // System.out.println(max);
            System.out.println("Second Largest element of given array is "+secMax);
        }
    }

