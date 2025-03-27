package recursion;

public class Q5 {
    //count zeroes
    public static void main(String[] args) {
        int num = 900456800;
        int count = 0;
        //we can also use helper function instead of directly using count variable
        System.out.println(countZeroes(num,count));
    }
    static int countZeroes(int n,int count){
        //this is base condition
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZeroes(n/10,count+1);
        }
        return countZeroes(n/10,count);
    }
}
