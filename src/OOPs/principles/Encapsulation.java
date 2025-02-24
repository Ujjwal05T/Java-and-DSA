package OOPs.principles;

class A{
    private int num;
    String name;
    int [] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        A obj = new A(5,"Ujjwal");
//        obj.num =2; //error coz of private ; this is data hiding now we can't access it directly
        //In encapsulation we do data hiding
         int a = obj.getNum();
    }
}
