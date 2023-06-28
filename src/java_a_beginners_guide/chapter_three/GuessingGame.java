package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Can you guess the letter between A and Z?");
        System.out.print("Guess here: ");
        char characterGuessed = scanner.next().charAt(0); //Takes a letter input.

        //Checks if the letter is right or not.
        //If it is correct it executes if otherwise else gets executed.
        if(characterGuessed == 'h' || characterGuessed == 'H') System.out.println("Hey, it was " + characterGuessed + " you just guessed it right. Congratulations!");
        else System.out.println("Nah! it was " + characterGuessed + " better luck next time.");
    }
}
