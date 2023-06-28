package java_a_beginners_guide.chapter_ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStrings {
    public static void main(String[] args) throws IOException {
        //Creating BufferedReader class object.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter lines of text, and the input exists with the word 'stop'.");
        System.out.print("Text here: ");
        String text;
        do {
            text = bufferedReader.readLine();
            System.out.println(text);
        }while(!text.equals("stop"));
    }
}
