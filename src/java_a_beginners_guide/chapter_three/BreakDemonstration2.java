package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class BreakDemonstration2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Using infinite loop to take a specific input.
        for(;;) {
            System.out.println("Press letter 'q' to exit a loop.");
            System.out.print("letter : ");

            //Takes a letter as input.
            char character = scanner.next().charAt(0);

            //Terminates the infinite loop if 'q' is pressed.
            if(character == 'q') break;
        }
    }
}
