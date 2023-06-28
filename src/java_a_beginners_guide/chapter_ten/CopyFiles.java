package java_a_beginners_guide.chapter_ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {

        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        //Copy a file.
        try {
            fileInputStream = new FileInputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/firstFile.txt");
            fileOutputStream = new FileOutputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/secondFile.txt");
            do {
                i = fileInputStream.read();
                if (i != -1) fileOutputStream.write(i);
            } while (i != -1);

        }catch(IOException ioException) {
            System.out.println("I/O Exception: " + ioException);
        }finally {
            try {
                if(fileInputStream != null) fileInputStream.close();
            }catch (IOException ioException) {
                System.out.println("Error closing input file");
            }

            try {
                if(fileOutputStream != null) fileOutputStream.close();
            }catch (IOException ioException) {
                System.out.println("Erorr closing output file");
            }
        }
    }
}
