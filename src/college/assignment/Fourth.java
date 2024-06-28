package college.assignment;

class Student {
    String name;
    int rollNo;
    char section;
    int age;
    String city;

    Student(String name,int rollNo,char section,int age,String city){
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
        this.age=age;
        this.city=city;
    }
    void getDetails(){
        System.out.printf("\nName : %s",this.name);
        System.out.printf("\nRoll No. : %d",this.rollNo);
        System.out.printf("\nSection : %c",this.section);
        System.out.printf("\nAge : %d",this.age);
        System.out.printf("\nCity : %s",this.city);
    }
}
public class Fourth {
    public static void main(String[] args) {
    Student s1 = new Student("Ujjwal",19,'B',21,"Indore");
    Student s2 = new Student("Sumit",20,'B',22,"Bhopal");
        System.out.print("\nDetails of Student 1:");
    s1.getDetails();
        System.out.print("\nDetails of Student 2:");
    s2.getDetails();
    }
}
