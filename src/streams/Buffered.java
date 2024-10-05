package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered {
    public static void main(String[] args) {
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter("Anime.txt"));
            br.write("Orewa uchiha Sasuke");
            br.close();
            BufferedReader bw = new BufferedReader(new FileReader("Anime.txt"));
            while (bw.ready()){
                System.out.println(bw.readLine());
            }
        }
        catch (Exception e){

        }
    }
}
