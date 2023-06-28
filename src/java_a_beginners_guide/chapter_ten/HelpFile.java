package java_a_beginners_guide.chapter_ten;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelpFile {
    public static void main(String[] args) {
        //Creating a file object.
        File helpFile = new File("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/helpfile.txt");

        //Using try-catch statement to create the file.
        try{
            if(!helpFile.exists()) {
                helpFile.createNewFile();
                System.out.println("HelpFile has been created successfully");
            }else {
                System.out.println("HelpFile already exists");
            }
        }catch(IOException ioException) {
            System.out.println("An error occured while creating a file");
        }

        //Writing the text to the file.
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(helpFile);

            //Text to write in the file.
            String helpSystemText = "#if" +
                    "\nif(condition) statement;" +
                    "\nelse statement;" +
                    "\n\n#switch" +
                    "\nswitch(expression) {" +
                    "\n\tcase constant:" +
                    "\n\t\tstatement sequence" +
                    "\n\t\tbreak;" +
                    "\n\t//..." +
                    "\n}" +
                    "\n\n#for" +
                    "\nfor(initialization; condition; iteration) statement;" +
                    "\n\n#while" +
                    "\nwhile(condition) statement" +
                    "\n\n#do-while" +
                    "\ndo{" +
                    "\n\tstatement;" +
                    "\n}while(condition);" +
                    "\n\n#break" +
                    "\nbreak; or break label;" +
                    "\n\n#continue" +
                    "\ncontinue; or continue label;";

            //Convert text to bytes array.
            byte[] textToBytes = helpSystemText.getBytes();

            //Write bytes to the file.
            fileOutputStream.write(textToBytes);

            System.out.println("Text written to the file successfully");
        }catch(IOException ioException) {
            System.out.println("An error occured while writing text to the file");
        }
    }
}
