package streams;

import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try{
            RandomAccessFile f = new RandomAccessFile("Anime.txt","rw");
            f.writeBytes("The Onepiece IS REAL");
            f.seek(0);
            int c = (int) f.length();
            byte [] bytes = new byte[c];
            for (int i = 0; i < c ; i++) {
                bytes[i]=f.readByte();
            }
            System.out.println(new String(bytes));


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
