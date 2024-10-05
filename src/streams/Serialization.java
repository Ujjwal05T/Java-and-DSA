package streams;

import java.io.*;

class Abc implements Serializable{
    int age =9;
    String name = "ujjwal";
}
public class Serialization {
    public static void main(String[] args) {
        try{
            Abc a = new Abc();

            FileOutputStream ff = new FileOutputStream("Anime.txt");
            ObjectOutputStream oo = new ObjectOutputStream(ff);
            oo.writeObject(a);
            FileInputStream fi = new FileInputStream("Anime.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Abc o =  (Abc) oi.readObject();
            System.out.println(o.name);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
