package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class InputCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Message to the user.
        System.out.println("Please enter a single character");
        System.out.print("Character: ");
        //Takes a character from the user using Scanner class
        //and saves it into a variable of type char.
        char character = scanner.next().charAt(0);

        //Displays the character here.
        System.out.println("Character you pressed is: " + character);
    }
}
