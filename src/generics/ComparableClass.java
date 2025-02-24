package generics;

class Student implements Comparable<Student>{
    String name;
    int marks;

    @Override
    public int compareTo(Student obj) {
        //if diff > 0 then obj is greater
        //if diff < 0 then this is greater
        int diff = this.marks - obj.marks;
        return diff;
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.marks = rollNo;
    }
}
public class ComparableClass {
    public static void main(String[] args) {
        Student s1 = new Student("A", 1);
        Student s2 = new Student("B", 2);
        if(s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2");
        }
        else{
            System.out.println("s2 is greater than s1");
        }
    }
}
