package college.assignment;
class Dog extends Animal{
    String breed;
    Dog(){
        name = "Tom";
        age= 10;
        breed = "German Shepherd";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        
    }
}
public class Thirteenth {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Breed of Dog:"+d.getBreed());
        System.out.println("Name of Dog:"+d.getName());
        System.out.println("Age of Dog:"+d.getAge());
        d.setBreed("Retriever");
        d.setName("Cheeku");
        d.setAge(10);
        System.out.println("Breed of Dog:"+d.getBreed());
        System.out.println("Name of Dog:"+d.getName());
        System.out.println("Age of Dog:"+d.getAge());
    }
}
