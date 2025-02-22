package OOPs;

public class Main {
    public static void main(String[] args) {
//        SingletonClass obj = new SingletonClass();  //Error: The constructor SingletonClass() is not visible
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        //Here we are getting same instance of the class ; all three objects are same
    }
}
