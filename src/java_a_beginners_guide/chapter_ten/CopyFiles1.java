package java_a_beginners_guide.chapter_ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles1 {
    public static void main(String[] args) {

        int i;

        //Copy a file.
        try (FileInputStream fileInputStream = new FileInputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/firstFile.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/secondFile.txt")){

            //Run the loop until 'i' is reached at the end of the file.
            do {
                i = fileInputStream.read();
                if(i != -1) fileOutputStream.write(i);
            }while(i != -1);
        }catch (IOException ioException) {
            System.out.println("I/O Exception: " + ioException);
        }
    }
}
