package java_a_beginners_guide.chapter_nine;
import java.io.IOException;
public class Throws {
    public static char prompt(String mMessage) throws IOException{
        //Taking input on console.
        System.out.print(mMessage + ": ");
        return (char) System.in.read();
    }
    public static void main(String[] args) {
        char character;
        try{
            character = prompt("Enter a letter");
        }catch(IOException exception) {
            System.out.println("I/O exception occured.");
            character = 'X';
        }
        System.out.println("You pressed " + character);
    }
}
