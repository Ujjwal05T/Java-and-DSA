package OOPs;

public class StaticBlock {
    //To initialize static variables we use static block
    //It is executed only once when 1st object is created
    static int a=5;
    static int b=10;

    static {
        System.out.println("Static block is invoked");
        a=10;
        b=20;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("Value of a: "+StaticBlock.a);
        StaticBlock.a=20;
        System.out.println("Value of a: "+StaticBlock.a);
    }
}
