package OOPs;

public class ObjectClass {
    public ObjectClass() {
        super();
    }
    //these are the methods of Object class
    @Override
    public int hashCode() {
        //returns a random integer for the object
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //later
        return super.clone();
    }

    @Override
    public String toString() {
        //returns the string representation of the object
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        //called by garbage collector before object is destroyed
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass();
        ObjectClass obj1 = obj;
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj1)); //checks if content are same or not
        System.out.println(obj==obj1);  //checks if references are same
        System.out.println(obj instanceof Object); //checks if obj is instance of ObjectClass
        System.out.println(obj.getClass()); //returns the class of the object and after it we can access more
        System.out.println(obj.getClass().getName());  //getClass is also method of Object class
    }
}
