package java_a_beginners_guide.chapter_ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {
    public static void main(String[] args) {
        String s;

        //Create and use a FileReader wrapped in a BufferedReader.
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/test.txt"))) {
            while((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }catch(IOException ioException) {
            System.out.println("I/O Error: " + ioException);
        }
    }
}
