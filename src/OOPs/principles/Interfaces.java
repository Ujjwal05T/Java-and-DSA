package OOPs.principles;
interface Engine{
    int price=9000000; //by default public static final
    void start();
    void stop();
}
interface Brake extends Media{
    void brake();
    void start();   //No problem with same method name in different interfaces because they are overridden in class
}
interface Media{
    void start();
    void pause();
    default void play(){
        System.out.println("Music Playing");
    }
}
class Car implements Engine, Brake{
    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    @Override
    public void brake() {
        System.out.println("Car braked");
    }
    @Override
    public void pause() {
        System.out.println("Media paused");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Car car = new Car();
        Engine e = new Car();
        e.start();
        e.stop();
//        e.brake();   //error
        car.start();
        car.brake();
        car.pause();
        System.out.println(Engine.price);
        car.play();
    }
}
