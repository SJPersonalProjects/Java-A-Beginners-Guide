package java_a_beginners_guide.chapter_ten;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) {

        //Creating a file object.
        File firstFile = new File("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/firstFile.txt");

        try {
            if(!firstFile.exists()) {
                firstFile.createNewFile();
                System.out.println("File created successfully");
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException ioException) {
            System.out.println("An error occured while creating the file");
        }

        //Creating the object for second file.
        File secondFile = new File("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/secondFile.txt");

        try{
            if(!secondFile.exists()) {
                secondFile.createNewFile();
                System.out.println("File created successfully");
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException ioException) {
            System.out.println("An error occured while creating the file");
        }

        try {
            //FileOutputStream to write some text in first file.
            FileOutputStream fileOutputStream = new FileOutputStream(firstFile);

            //Some text to store in the first file.
            String text = "This the text for first file";
            
            //Converts text to bytes array.
            byte[] bytesToWrite = text.getBytes();

            //Writes byte array to file.
            fileOutputStream.write(bytesToWrite);

            System.out.println("Text written to file successfully");
        }catch (IOException ioException) {
            System.out.println("An error occured while writing text to the file");
        }


    }
}
