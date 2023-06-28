package java_a_beginners_guide.chapter_ten;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
    public static void main(String[] args) {

        int i = 0, j = 0;

        //Compare two files...
        try (FileInputStream f1 = new FileInputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/firstFile.txt");
        FileInputStream f2 = new FileInputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/secondFile.txt")) {
            //Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();

                if(i != j) break; //To stop the loop if the files differ.
            }while(i != -1 && j != -1);

            if(i != j) System.out.println("File have different content");
            else System.out.println("Files have same content");
        }catch(IOException ioException) {
            System.out.println("I/O Error: " + ioException);
        }
    }
}
