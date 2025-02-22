package OOPs;

public class SingletonClass {
    //It is a class whose object can be created only once
    //We can create a class as singleton by making its constructor private
    //and creating a static method that returns the instance of the class
    private SingletonClass(){

    }
    //This is the only instance of the class
    //if we don't have a object of the class, we will create it
    //if we have it, we will return it
    //this is how only object is created once only
    private static SingletonClass instance;
    public static SingletonClass getInstance() {
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }

}
