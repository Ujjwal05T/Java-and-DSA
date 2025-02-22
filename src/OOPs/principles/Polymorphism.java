package OOPs.principles;

class Shapes{
    void area(){
        System.out.println("Area of shape");
    }
}

class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shapes{
    @Override
    void area(){
        System.out.println("Area of Rectangle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes c = new Circle();
        Rectangle r = new Rectangle();
        //Method Overriding
        s.area();
        c.area(); //c is reference of Shapes but object is of Circle but it will call the area method of Circle ,it is called dynamic method dispatch.
        r.area();

        //method Overloading
        sum(3,4);
        sum(3,4,5);
        sum(3,4,5,6,7);
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }
    //varargs, multiple arguments in form of array
    static void sum(int  ...args){
        int result = 0;
        for(int a:args){
            result +=a;
        }
        System.out.println(result);
    }
}
