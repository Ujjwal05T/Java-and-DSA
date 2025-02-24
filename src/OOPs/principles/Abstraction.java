package OOPs.principles;
abstract class Parent{
    abstract void show();
    abstract void fun();
}
class Child extends Parent{
    @Override
    void show() {
        System.out.println("Uzumaki Naruto");
    }
    @Override
    void fun() {
        System.out.println("The Onepiece is real");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Child child = new Child();

    }
}
