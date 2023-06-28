package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class GuessingGameV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, wanna play guess a letter game?");
        System.out.print("Guess the correct letter here: ");
        char characterGuessed = scanner.next().charAt(0);

        //Checks if the letter is correct or not.
        if(characterGuessed == 'N' || characterGuessed == 'n') {
            System.out.println("Hey, correct... it is actually " + characterGuessed + " congratulations!");
        }else {
            System.out.println("Sorry, you just missed it");

            //Checks if the character is lower / higher than the actual character.
            if(characterGuessed < 'N' || characterGuessed < 'n') {
                System.out.println("You guessed lower than the actual character... better luck next time.");
            }else {
                System.out.println("You guessed higher than the actual character... better luck next time.");
            }
        }
    }
}
