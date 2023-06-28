package java_a_beginners_guide.chapter_ten;

import java.io.*;

public class KtoD {
    public static void main(String[] args) {

        File fileText = new File("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/test.txt");

        try{
            if(!fileText.exists()) {
                fileText.createNewFile();
                System.out.println("File has been created successfully");
            }else {
                System.out.println("File already exists.");
            }
        }catch(IOException ioException) {
            System.out.println("File creating error.");
        }

        //Creating BufferedReader object.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text;

        System.out.println("Enter text and to exit enter 'stop' word");

        try(FileWriter fileWriter = new FileWriter("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/test.txt")) {
            do {
                System.out.print(": ");
                text = bufferedReader.readLine();

                if (text.compareTo("stop") == 0) break;

                text.concat("\r\n");

                fileWriter.write(text);
            } while (text.compareTo("stop") != 0);

//            //Try catch statement to write text to the file using try-with-resource statement from the book.
//            try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/test.txt")) {
//                byte[] bytesToWrite = text.getBytes();
//
//                //Write bytes array to files.
//                fileOutputStream.write(bytesToWrite);
//
//                System.out.println("Text written to the file successfully");
//            }catch (IOException ioException) {
//                System.out.println("Error writing text to the file");
//            }
//        }catch(IOException ioException) {
//            System.out.println("I/O Exception " + ioException);
//        }
        }catch(IOException ioException) {
            System.out.println("I/O Exception " + ioException);
        }
    }
}
