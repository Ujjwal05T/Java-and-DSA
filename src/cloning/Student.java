package cloning;

public class Student implements Cloneable{
    String name;
    int rollNo;
    int [] arr;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.arr= new int[]{1, 2, 3, 4, 5};
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
        //this creates shallow copy
//        return super.clone();
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //this creates deep copy
        Student s = (Student) super.clone();
        s.arr = new int[this.arr.length];
        for(int i=0;i<this.arr.length;i++){
            s.arr[i]=this.arr[i];
        }
        return s;
    }
}
