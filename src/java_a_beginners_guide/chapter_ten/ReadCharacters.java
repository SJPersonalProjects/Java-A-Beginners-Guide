package java_a_beginners_guide.chapter_ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacters {
    public static void main(String[] args) throws IOException {
        char character;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any character and period to stop/quit.");
        //Reading characters.
        do {
            character = (char) bufferedReader.read();
            System.out.println(character);
        }while(character != '.');
    }
}
