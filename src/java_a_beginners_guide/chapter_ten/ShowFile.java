package java_a_beginners_guide.chapter_ten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;

        //first make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fileInputStream = new FileInputStream(args[0]);

            do{
                i = fileInputStream.read();
                if(i != -1) System.out.print((char) i);
            }while(i != -1);
        }catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File Not Found");
        }catch (IOException ioException) {
            System.out.println("An I/0 Exception Occured");
        }finally {
            //Close the file in all cases.
            try {
                if(fileInputStream != null) fileInputStream.close();
            }catch (IOException ioException) {
                System.out.println("Error Closing File");
            }
        }
    }
}
