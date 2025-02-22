package OOPs;

public class InnerClasses {
    //outside classes cannot be static.
    //Only inner classes can be static.

     static class Inner {
        String name = "Inner class";
    }

    public static void main(String[] args) {
        //If we want to access inner class, we need to create object of outer class
        //So we make the class static
//        InnerClasses obj = new InnerClasses();
//        InnerClasses.Inner inner = obj.new Inner();
//        System.out.println(inner.name);

        Inner inner2 = new Inner();
        System.out.println(inner2.name);
    }
}
