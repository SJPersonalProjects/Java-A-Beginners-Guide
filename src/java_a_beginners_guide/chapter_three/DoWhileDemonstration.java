package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class DoWhileDemonstration {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        char characterEntered;
        do{
            System.out.println("Press a key followed by Enter");
            characterEntered = scanner.next().charAt(0); //gets a key from the user.
        }while (characterEntered != 'a');
    }
}
