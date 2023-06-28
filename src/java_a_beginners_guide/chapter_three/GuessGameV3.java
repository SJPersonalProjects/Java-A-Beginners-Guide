package java_a_beginners_guide.chapter_three;

import java.util.Scanner;

/**
 * This game is the ultimate version of guess a letter game.
 * This generates some random floating point number and then is converted to integers between 96 and 123.
 * Then is converted to char type which becomes any small character from english alphabets.
 * That random generated alphabet is compared with the user's input by letting them guess the correct letter.
 * The game continues to iterate by guiding the user about the lower/higher position of the correct letter.
 * It ends with the congratulations message as user wins by guessing the correct alphabet eventually.
 */
public class GuessGameV3 {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        //This code generates some random integers between 96 and 123.
        //While loop keeps iterating until it generates integers between 96 and 123.
        boolean condition = true;
        while(condition) {
            double randomNumber = Math.random()*122;
            int randomInteger = (int) randomNumber;

            //If the numbers are between 96 and 123 which are the small alphabets in ASCII code.
            if(randomInteger >= 97 && randomInteger <= 122) {

                //Converting that random generated integer into character type.
                char characterToGuess = (char) randomInteger;
                System.out.println("The actual letter is : " + characterToGuess + "\n");
                char characterGuessed;

                //Number of attempts counter to keep the track of attempts.
                int numberOfAttempts = 1;

                //Beginning message.
                System.out.println("Hey, wanna play guess a letter game?");
                //Do-while loop keeps iterating until the user guesses the right alphabet.
                do {
                    //Begin playing the guess game.
                    System.out.print("Attempt " + numberOfAttempts + " Guess here: ");
                    characterGuessed = scanner.next().charAt(0); //Get a letter from the user.

                    //Comparing the position of the character
                    //Then, guiding if its lower or higher based on its position.
                    if(characterGuessed == characterToGuess) {
                        //Winning message.
                        System.out.println("\nWoah, you just guessed right letter congratulations!");
                        System.out.println("...it just took you " + numberOfAttempts + " attempts.");
                    }else if(characterGuessed < characterToGuess) {
                        //Displaying the message if it's missed.
                        System.out.println("\nSorry, you missed it.");
                        System.out.println("...the actual character is lower than that.");
                        //Increasing the number of attempt by 1.
                        numberOfAttempts++;
                    }else {
                        //Displaying the message if that's missed.
                        System.out.println("\nSorry, you missed it.");
                        System.out.println("...the actual character is higher than that.");
                        //Increasing the number of attempt by 1.
                        numberOfAttempts++;
                    }
                } while(characterGuessed != characterToGuess);

                //And when the letters are guessed after if is executed, it also terminates the while condition.
                //To end the game.
                condition = false;
            }
        }
    }
}
