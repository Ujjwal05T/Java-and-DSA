package college.assignment;
class Animal{
    String name;
    int age;
    Animal(){
        name = "Dog";
        age = 12;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Twelth {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.getName()); // before setter
        System.out.println(a.getAge());
        a.setAge(21);
        a.setName("Cat");
        System.out.println(a.getName());  //after setter
        System.out.println(a.getAge());
    }
}
