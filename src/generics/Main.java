package generics;

public class Main implements GenericInterfaces<String>{
    public static void main(String[] args) {
        Main m = new Main();
        m.display("Generics are used for type safety");
    }

    @Override
    public void display(String value) {
        System.out.println(value);
    }
}
