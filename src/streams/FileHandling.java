package streams;

import java.io.*;

public class FileHandling  {
    public static void main(String[] args) {
        try{
            FileReader br = new FileReader("Anime.txt");
            FileWriter bw = new FileWriter("Anime.txt");
            bw.write("The twopiece is real");
            bw.close();
            int c;
           while(br.ready()){
               c=br.read();
               System.out.print((char) c);
           }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
