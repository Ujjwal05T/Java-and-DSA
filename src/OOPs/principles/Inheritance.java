package OOPs.principles;
class Box{
//    private double length;
    double length;
    double breadth;
    double height;
    Box(){
        length = -1;
        breadth = -1;
        height = -1;
    }
    Box(double l, double b, double h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    //copy constructor
    Box(Box old){
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }
}
//BoxWeight is inheriting Box hence it has access to all the properties of Box
class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        weight = -1;
    }
    public BoxWeight(double l, double b, double h, double w){
        super(l, b, h);  //here super is used to call the constructor of parent class
        this.weight = w;
    }
    //copy constructor
    BoxWeight(BoxWeight old){
        super(old); //here super is used to call the copy constructor of parent class , old object has only access to Box properties in super.
        this.weight = old.weight;
    }
}
//multilevel inheritance
class BoxPrice extends BoxWeight{
    double price;
    public BoxPrice(){
        price = -1;
    }
    public BoxPrice(double l, double b, double h, double w, double p){
        super(l, b, h, w);
        this.price = p;
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        BoxWeight box = new BoxWeight();//call default constructor for Box and BoxWeight
        BoxWeight box2 = new BoxWeight(1, 2, 3, 4);
//        System.out.println(box.length); error if length is private
        System.out.println(box2.breadth);

        Box box3 = new BoxWeight(1, 2, 3, 4); //upcasting
        //here we can only access the properties of Box/parent class
//        System.out.println(box3.weight); //error because weight is not in Box class

//        BoxWeight box4 =  new Box(); //error because Box is not a subclass of BoxWeight
//        BoxWeight box5 = (BoxWeight) new Box(); //downcasting

        BoxPrice box = new BoxPrice(1, 2, 3, 4, 5);
        System.out.println(box.price+" "+  box.weight+" "+box.breadth+" "+ box.height);
    }
}
